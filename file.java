package assignment2;
import java.io.*;
public class file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file= new File("/Users/shubham/Desktop/assignment/src/assignment2/abc.txt");
	FileReader in=null;
	in =new FileReader(file);
	int c;
	while((c=in.read())!=-1){
		System.out.println((char)c);
	}
	}

}
