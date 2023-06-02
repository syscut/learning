package learning;

import java.util.LinkedHashMap;
import java.util.Map;

public class camelCaseToSnakeCase {
	public static void main(String[] args) {
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("accNoNoo".replaceAll("(.+?)(\\p{Lu})", "$1_$2").toLowerCase(), "2");
		map.put("no", "3");
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " : " + e.getValue());
		});
	}
}
