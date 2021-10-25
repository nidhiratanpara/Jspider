package com.demo.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws Exception {
		FileInputStream fs=new FileInputStream("I:\\NIDHI_jjj\\obj.ser");
		ObjectInputStream oi=new ObjectInputStream(fs);
		A a1=(A)oi.readObject();
		oi.close();
		System.out.println(a1.i);
		System.out.println(a1.j);
		
		
	}

}
