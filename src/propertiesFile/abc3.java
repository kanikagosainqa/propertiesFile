package propertiesFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class abc3 {

	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("loginCredentials.properties");
		Properties p = new Properties();
		p.load(r);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}

}
