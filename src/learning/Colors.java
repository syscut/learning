package learning;

public class Colors {

	public static void main(String[] args) throws Exception {
//		final String ANSI_RESET = "\u001B[0m";
//		final String ANSI_BLACK = "\u001B[30m";
//		final String ANSI_RED = "\u001B[31m";
//		final String ANSI_GREEN = "\u001B[32m";
//		final String ANSI_YELLOW = "\u001B[33m";
//		final String ANSI_BLUE = "\u001B[34m";
//		final String ANSI_PURPLE = "\u001B[35m";
//		final String ANSI_CYAN = "\u001B[36m";
//		final String ANSI_WHITE = "\u001B[37m";
//		final String ANSI_RED_BACKGROUND = "\u001B[41m";
//		final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
//		final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
//		final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
//		final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
//		final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
//		final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
//		System.out.println(ANSI_RED_BACKGROUND + "This text is red!" + ANSI_RESET);
//		System.out.println(ANSI_GREEN_BACKGROUND + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_BLUE_BACKGROUND + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_PURPLE_BACKGROUND + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_CYAN_BACKGROUND + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_WHITE_BACKGROUND + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_YELLOW_BACKGROUND + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_BLUE + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_RED + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_BLUE + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_GREEN + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_YELLOW + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_PURPLE + "This text is green!" + ANSI_RESET);
//		System.out.println(ANSI_CYAN + "This text is green!" + ANSI_RESET);

//		final String FILE_URL = "https://start.spring.io/starter.zip?name=buildTest-1&groupId=com.gfc&artifactId=autoBuildTest&version=0.0.1-SNAPSHOT&description=%E6%B8%AC%E8%A9%A6%E8%87%AA%E5%8B%95%E8%B3%87%E6%96%99%E5%BA%AB%E9%83%A8%E5%B1%AC%E5%8A%9F%E8%83%BD&packageName=com.gfc.test&type=maven-project&packaging=jar&javaVersion=11&language=java&bootVersion=2.7.5&dependencies=lombok&dependencies=configuration-processor&dependencies=data-jpa&dependencies=web";
//		BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
//		final String p = "D:/runtime-EclipseApplication/firstTest.zip";
//		File f = new File(p);
//		if (f.delete()) {
//			System.out.println("success delete");
//		} else {
//			System.out.println("delete faild");
//		}
		Encrypt encrypt = new Encrypt();
		System.out.println(encrypt.encode("password"));
	}

}
