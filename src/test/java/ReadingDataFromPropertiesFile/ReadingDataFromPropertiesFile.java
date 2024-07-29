package ReadingDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//opening the property file in read mode
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Test.properties");
		
		//creating iobj of properties and loading the file
		Properties obj=new Properties();
		obj.load(file);
		
		//get the properties
		String url=obj.getProperty("Url");
		String username=obj.getProperty("Username");
		String password=obj.getProperty("Password");
		String email=obj.getProperty("Email");
		
		System.out.println(url+" "+username+" "+password+" "+email);
		
		//Reading only keys
		/*Set<String> keys=obj.stringPropertyNames();
		System.out.println(keys);*/
		
		//or
		
		Set<Object> keys=obj.keySet();
		System.out.println(keys);
		
		//Read all values
		Collection<Object> Values=obj.values();
		System.out.println(Values);
		
		file.close();

	}

}
