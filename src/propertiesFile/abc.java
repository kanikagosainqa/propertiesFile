package propertiesFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class abc {

	public static void main(String[] args) throws IOException {	
		Properties p = new Properties();
		FileWriter w = new FileWriter("loginCredentials.properties");
		p.setProperty("user", "kanika");
		p.setProperty("pwd", "Kanika@321#");
		p.store(w, null);
	}

}
