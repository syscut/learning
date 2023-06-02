package learning;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Set;
import java.util.concurrent.Exchanger;

public class VisibilityProblem {
	static volatile int num;

//	static int num;
	public static void main(String[] args) {
		Exchanger<Integer> exchanger = new Exchanger<>();
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long startTime = System.nanoTime();
		Thread readerThread = new Thread(() -> {
			int temp = 0;
			int anotherThreadData = 0;
			while (true) {
				try {
					anotherThreadData = exchanger.exchange(num);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (temp != anotherThreadData) {
					temp = anotherThreadData;
					System.out.println("reader: value of num = " + anotherThreadData);
				}
			}
		});

		Thread writerThread = new Thread(() -> {
			for (int i = 0; i < 2; i++) {
				num++;
				System.out.println("writer: changed value to = " + num);
				try {
					exchanger.exchange(num);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

				// 進入睡眠，以讓readerThread有足夠時間讀到int
				// num的改變(因為num++非具原子性的操作，readerThread仍有一定機會讀到錯誤的值)
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 離開程式，否則readerThread會一直等待變數int num的值改變
			bean.setThreadContentionMonitoringEnabled(true);
			Set<Thread> threads = Thread.getAllStackTraces().keySet();

			System.out.printf("%-15s \t %-15s \t %-15s \t %-15s \t %-15s \t %s\n", "Name", "State", "Priority",
					"isDaemon", "User Time", "CPU Time");
			for (Thread t : threads) {

				System.out.printf("%-15s \t %-15s \t %-15d \t %-15s \t %-15d \t %d\n", t.getName(), t.getState(),
						t.getPriority(), t.isDaemon(), bean.getThreadUserTime(t.getId()),
						bean.getThreadCpuTime(t.getId()));
			}

			System.out.println("total time = " + (System.nanoTime() - startTime) + "secodes");

			System.exit(0);
		});
		readerThread.setName("Read Thread");
		writerThread.setName("Write Thread");
		readerThread.start();
		writerThread.start();
		System.out.println("active threads " + Thread.activeCount());

	}
}
