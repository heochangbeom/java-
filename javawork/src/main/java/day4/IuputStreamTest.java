package day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IuputStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fw = new FileInputStream("c:/Temp/data.txt");
		
		int readByte;
		while((readByte = System.in.read()) != -1 ) {		
			fw.writer(readByte);
	}
		fw.close();
				
	}
}
