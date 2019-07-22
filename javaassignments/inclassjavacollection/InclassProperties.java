package inclassjavacollection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class InclassProperties {
	public static void main(String [] args) throws IOException
	{
		
		Properties prop= new Properties();
		
		String path = "C:\\Users\\Gaurav\\eclipse-workspace\\HelloWorld\\myfile.properties";
		//read the file
		FileInputStream fs= new FileInputStream(path);
		prop.load(fs);
		prop.getProperty("name");
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("Password"));
		
				
		
	}

}
