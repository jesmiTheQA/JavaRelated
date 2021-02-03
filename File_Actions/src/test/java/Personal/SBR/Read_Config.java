package Personal.SBR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Config {

	
	public static void main(String args[]) throws IOException{
		
		Properties prop = readPropertiesFile("D:/U42020/Non-Project/Space for Eclipse/Selef Learn/File_Actions/src/test/java/Personal/SBR/config.properties");
		System.out.println("URL is: "+ prop.getProperty("url"));
		System.out.println("User name is: "+ prop.getProperty("username"));
	}
	
	
	public static Properties readPropertiesFile(String fileName) throws IOException{
	      FileInputStream fis = null;
	      Properties prop = null;
	    
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	         fis.close();
	      return prop;
	   }
}
