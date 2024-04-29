package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	public static Properties pr ;
	 public static FileInputStream fis;
	 
	 
	 public static void userLogin () throws IOException {
	 pr= new Properties();
	    fis = new FileInputStream("C:\\Users\\ftosh\\eclipse-workspace\\Cucumber\\configs.properties");
	 
	 pr.load(fis);
	 
	 }
}
