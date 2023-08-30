package learning;

import java.util.Arrays;

public class RegexpTest {
	public static void main(String[] args) {
		Arrays.asList("1|2|4".split("\\|")).forEach(v -> {
			System.out.println(v);
		});

	}
}
