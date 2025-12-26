package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JProperties {

	/**
	 * This is used to get  properties
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromProperties(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(IPathStatics.filePath);
		Properties pro= new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}
}
