package com.tryCatchdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VariationOfTryCatchBlocks7 {

	public static void main(String[] args) {

		File myFile = new File(System.getProperty("user.dir") + "/src/test/java/com/tryCatchdemo/demo.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {

			System.out.println(br.readLine());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
