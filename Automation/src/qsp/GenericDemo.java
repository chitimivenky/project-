package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * this is a generic method for data driver testing
 * @author MAHESH
 */
public class GenericDemo {
/**
 *this is  generic method for reading the data from property file
 *@paramkey
 *@return string
 * @throws IOException 
 *@throws Exception
 * 
 */
public String getpropertydata(String key) throws IOException {
	FileInputStream file=new FileInputStream("./data/cv.property");
	Properties p=new Properties();
	String data = p.getProperty(key);
	return data;
}
	}



