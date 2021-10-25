package com.demos.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//write in file

public class Demo3 {
	
public static void main(String[] args) throws IOException  {
	
	FileWriter ff=new FileWriter("I://NIDHI_jjj//file_fold//abc.txt");
	BufferedWriter bf=new BufferedWriter(ff);
	bf.write("hello");
	bf.flush();
	bf.close();
	System.out.println("done");
}
}
