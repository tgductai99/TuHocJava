package tuhocjavacore.Lab.Lab10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Video59 {
	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		System.out.println(System.getProperty("user.dir"));
		try {
			// inputStream = new FileReader(
			// "C:/Users/tuan.pv/Documents/workspace-spring-toolsuite-4-4.20.0.RELEASE/hoidanit/hoidanit");
			inputStream = new FileReader("text123");
			outputStream = new FileWriter("characteroutput.txt");
			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
