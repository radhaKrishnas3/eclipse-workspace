package fileStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		// String path=
		// System.getProperty("user.dir")+"/src/fileStreams/"+System.currentTimeMillis()+".txt";
		//String path = System.getProperty("user.dir") + "/src/fileStreams/" + "1653134227481.txt";
		//String path = System.getProperty("user.dir")+"/src/fileStreams/"+System.currentTimeMillis()+".csv";
		String path = System.getProperty("user.dir")+"/src/fileStreams/"+System.currentTimeMillis()+".html";

		// stream connectivity
		File f = new File(path);
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter writer = new BufferedWriter(fw);

		// writing inside
//		writer.write("First line");
//		writer.newLine();
//		writer.write("second line");
//		writer.newLine();
//		writer.write("india line");
		
		//creating txt file
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				writer.write(Math.random() * 100+ "\t");
//			}
//			writer.newLine();
//		}
		
		//create CSV
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				double num = Math.random()*100;
//				double round = Math.round(num*100.0)/100.0;	//rounding odd to 2 digits
//				writer.write(round+",");
//			}
//			writer.newLine();
//		}
		
		//creating html
		writer.write("<html> <body> <title>Way2 automation</title> <h1>Learning java</h1> </body> </html>");
				

		// close the stream
		writer.close();
		System.out.println("File is created");
	}
}
