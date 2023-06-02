package learning;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {

	public static void main(String[] args) throws IOException {
		String[] parameters = { "param0", "param11", "param2", "param3", "param4", "param5", "param6", "param7",
				"param8", "param9", "param10", "param1", };
		Arrays.sort(parameters, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.valueOf(o1.replace("param", "")).compareTo(Integer.valueOf(o2.replace("param", "")));
			}
		});
		for (String p : parameters) {
			System.out.println(p);
		}
	}

}
