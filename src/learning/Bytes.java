package learning;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Bytes {

	public static void main(String[] args) {
//		列出所有charset
//		Map<String, Charset> charset = Charset.availableCharsets();
//		Set<Entry<String,Charset>> set = charset.entrySet();
//		for(Entry<String,Charset> entry : set) {
//			System.out.println(entry.getKey() + "=" + entry.getValue());
//		}
//		final LinkedList<String> keys = new LinkedList<>();
		Charset charset = Charset.forName("MS950");
		ByteBuffer buffer = ByteBuffer.wrap("\ue0003".getBytes(charset));
		int high = buffer.get(0) & 0xFF;
		int low = buffer.get(1) & 0xFF;
//		low -= (short)"\u003f".toCharArray()[0];
//		byte[] b = {buffer.get(0),buffer.get(1)};
//		System.out.println((char)buffer.get(0) << 8|buffer.get(1));
		System.out.println("high=" + high + " low=" + low);
		System.out.println("\ue000");
	}
}
