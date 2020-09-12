package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		
		String location = "UsingFileOutputStream.txt";
		String content = "This is FileOutputStream class...";
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		
		byte[] writeThis = content.getBytes();
		
		fileOutputStream.write(writeThis);
		fileOutputStream.close();
		
		
		
		
		
	}

}
