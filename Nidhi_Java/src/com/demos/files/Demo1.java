package com.demos.files;

import java.io.File;

//folder creation

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	File f=new java.io.File("I://NIDHI_jjj//file_fold");
	if(!f.exists()){
		f.mkdir();
		System.out.println("folder created");
	}
	else
	{
		System.out.println("folder already exists");
	}

	}

}
