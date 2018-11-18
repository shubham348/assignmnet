package aasignmen2;
// if u ever copy the code to another place remember to change the path of files also ...
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileproject {

	private static FileWriter out;

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:/Users/shubham/Desktop/assignment/src/assignment2/s.txt"));
			String line = reader.readLine();
			while (line != null) {
				// taking path from text file
				
				String FilePath = line;
				System.out.println(FilePath);
				File f = new File(FilePath);
				
				
				//creating output file
				
				File outfile = new File("C:/Users/shubham/Desktop/assignment/src/assignment2/abc.txt");
				out = new FileWriter(outfile,true);
				
				//creating list of file
				File[] files=f.listFiles();	
				out.append("FILES PRESENT IN PATH "+line+"\n");
					// printing output with file name and file path
					for(int i=0;i<files.length;i++){	
						out.append("FileName:"+files[i].getName()+ "\n\t Filepath:"+files[i]+ "\n");
				       
						
					}
					out.append("\n\n");
					out.flush();
					System.out.println("output printed sucsessfully");
					
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}