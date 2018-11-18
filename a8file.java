package aasignmen2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class a8file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f = new File("C:/Users/shubham/Desktop/assignment/src/aasignmen2/a8.txt");
		System.out.println(f);
		BufferedReader 	reader = new BufferedReader(new FileReader(f));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
		}
	}


