package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingFileWriter1.txt";
		
		FileReader fileReader = new FileReader(location);
		BufferedReader reader = new BufferedReader(fileReader);
		String getLine;
		while((getLine=reader.readLine())!=null){
			System.out.println(getLine);
		}
		reader.close();
		

	}

}
