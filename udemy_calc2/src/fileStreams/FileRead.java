package fileStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		String path=System.getProperty("user.dir")+"/src/fileStreams/1653134227481.txt";
		
		//connecting stream
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//reading txt file
		//System.out.print(reader.readLine());
		
		String line = null;
		while((line = reader.readLine())!=null) {
			System.out.println(line);
		}
		
		reader.close();
	}
}
