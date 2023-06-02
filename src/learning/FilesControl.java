package learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class FilesControl {
	public static void main(String[] args) {
		try {
			FileReader configFile = new FileReader("/opt/tomcat/conf/gfc-config.properties");
			BufferedReader file = new BufferedReader(configFile);
			LinkedList<String> paths = new LinkedList<>();
			String line;
			while ((line = file.readLine()) != null) {
				if (line.contains("gfc.permitAllURI=")) {
					System.out.println(line.split("=")[1]);
					paths.addAll(List.of(line.split("=")[1].split(",")));
				}

			}
			file.close();
			System.out.println(
					paths.stream().anyMatch(p -> Pattern.compile(p).matcher("/assets/index/js/abc.js").matches()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
