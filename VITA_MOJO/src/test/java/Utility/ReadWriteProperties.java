package Utility;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteProperties {
	public String getProperties(String Key) throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream("src\\test\\resources\\config.properties"));
		return prop.getProperty(Key);
	}

}
