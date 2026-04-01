package com.tryCatchdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VariationOfTryCatchBlocks5 {

	public static void main(String[] args) {

		File myFile = new File(System.getProperty("user.dir") + "/src/test/java/com/tryCatchdemo/demo.txt");
		FileReader fr;
		BufferedReader br = null;
		try {
			fr = new FileReader(myFile);
			br = new BufferedReader(fr);
			String line = br.readLine();
			System.out.println(line);
		} catch (IOException e) {
 
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
