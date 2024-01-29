package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropData {
 public String getPropData(String dataToBeRead) throws IOException {
	 String folderPath = System.getProperty("user.dir")+"\\test\\resources\\config.properties";
	 FileInputStream fis = new FileInputStream(folderPath);
	 Properties prop = new Properties();
	 prop.load(fis);
	 String data= prop.getProperty(dataToBeRead);
	 return data;
 }
 public static void main(String[] args) throws IOException {
	ReadPropData r = new ReadPropData();
	String s =r.getPropData("username");
	System.out.println(s);
}
}
