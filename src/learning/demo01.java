package learning;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

public class demo01 {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		Integer a = 1;

	}

	private static String castAs(String sql) {

		StringBuilder fromStatment = new StringBuilder(sql.replaceAll("(?i)select.+?( from.*$)", "$1"));
		StringBuilder selectStatment = new StringBuilder();
		char as = 65;
		String x_ = " as X_";
		char comma = 32;
		for (String col : Arrays.asList(sql.replaceAll("(?i)(select.+?) from.*$", "$1").split(","))) {
			if (as > 90) {
				as = 65;
				x_ += as;
			}
			if (Pattern.compile("(?i).+as.+").matcher(col).matches()) {
				col = col.replaceAll("(?i)(^.+?)( as .+)$", "$1");
			}
			selectStatment.append(" " + comma + col + x_ + as);
			as++;
			comma = 44;
		}
		return String.valueOf(selectStatment.append(fromStatment));

	}
//	static {
//		always first
//		System.out.println("192.6.132.34".split(",")[0]);
//
//		System.out.println("begin");
//		System.out.println("/abc".equals("/abc"));
//	}

}
