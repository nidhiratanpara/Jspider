package com.demos.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// read in file

public class Demo4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         FileReader fr=new FileReader("I://NIDHI_jjj//file_fold//abc.txt");
         BufferedReader br=new BufferedReader(fr);
         String s=br.readLine();
         br.close();
         System.out.println(s);
         
         
	}

}
