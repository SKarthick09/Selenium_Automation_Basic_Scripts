package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingFileWriter2.txt";
		String content = "This is FileWriter class..."  + "\n This is one of the method" + "Hai!!!!";
		
		FileWriter fileWriter = new FileWriter(location);
		
		fileWriter.write(content);
		
		fileWriter.close();
		
		

	}

}
