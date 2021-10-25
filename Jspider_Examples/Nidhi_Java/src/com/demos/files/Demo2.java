package com.demos.files;

import java.io.File;
import java.io.IOException;

//file creation 
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File fs=new File("I://NIDHI_jjj//file_fold//abc.txt");
		if(!fs.exists())
		{
			fs.createNewFile();
			System.out.println("file created");
		}
		else
		{
			System.out.println("file exists");
		}

	}

}
