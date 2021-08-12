//package introductionToFiles;
import java.io.*; //donot forget!


public class FilesIntro {

	
	public static void main(String[] args) {

		    //make a connection to a file
			File fileName = new File("hello.txt");
			
			//declare and initialize a print writer object
			PrintWriter printer = null;
			
			//try connecting to the file and writing to it
			try {
				printer = new PrintWriter(fileName);
				printer.println("Hello World! This is a new file.");
			}	
		    //catch any exception resulting from the try
			catch(FileNotFoundException exception) {
				System.err.println("The specified file does not exist!");
			}
			
			//Close the connection to the file
			printer.close();
			
		
	}
}
