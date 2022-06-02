package fileStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"/src/propFile/object.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
	}
}
