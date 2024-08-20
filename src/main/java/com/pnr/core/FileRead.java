package main.java.com.pnr.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
 
	public static void main(String[] args) throws IOException {

		FileReader in = new FileReader("C:/Users/pnara/OneDrive/Desktop/Task/Data.tex");
		BufferedReader br = new BufferedReader(in);

		while (br.readLine() != null) {
			System.out.println(br.readLine());
		}
		in.close();

	}
}