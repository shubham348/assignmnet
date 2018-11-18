package aasignmen2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class a9filewithoutputfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:/Users/shubham/Desktop/assignment/src/aasignmen2/a8.txt");
		
		BufferedReader 	reader = new BufferedReader(new FileReader(f));
		String line = reader.readLine();
		File outfile = new File("C:/Users/shubham/Desktop/assignment/src/aasignmen2/a9abc.txt");
		FileWriter out = new FileWriter(outfile,true);
		while (line != null) {
			out.append(line+"\n");
			line = reader.readLine();
		}
		reader.close();
		out.flush();
		
		File fout = new File("C:/Users/shubham/Desktop/assignment/src/aasignmen2/a9abc.txt");
		BufferedReader 	reader1 = new BufferedReader(new FileReader(f));
		String line1 = reader1.readLine();
		while (line1 != null) {
			System.out.println(line1);
			line1 = reader1.readLine();
		}
		reader1.close();
		
		//creating list of file
		
	}

}
