package learning;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.regex.Pattern;

public class demo01 {
	public static void main(String[] args) {
//		Locale.setDefault(Locale.TAIWAN);
//		Map<String, Object> m = Map.of("a", "1", "b", "2");
		Double a = 1.0000;

		System.out.println(BigDecimal.valueOf(1000, 3));
//		Map<String, Map<String, Object>> m = new LinkedHashMap<>();
//		Map<String, Object> l = new LinkedHashMap<>();
//		if (m.get("a") == null) {
//			System.out.println("m.get(a) == null");
//			l.put("a.a", "1");
//			m.put("a", l);
//		} else {
//			System.out.println("not null");
//		}
//		l = Map.of("a.b", "2");
//		m.put("a", l);

//		m.entrySet().forEach(k -> {
//			System.out.println(k.getKey() + " : " + k.getValue());
//		});

//		Iterator<Entry<String, Object>> i = m.entrySet().iterator();
//		System.out.println(i.hasNext());
//		Entry<String, Object> e = i.next();
//		System.out.println(e.getKey() + " : " + e.getValue());
//		e = i.next();
//		System.out.println(e.getKey() + " : " + e.getValue());
//		e = i.next();
//		System.out.println(e.getKey() + " : " + e.getValue());
//		e = i.next();
//		System.out.println(e.getKey() + " : " + e.getValue());

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
