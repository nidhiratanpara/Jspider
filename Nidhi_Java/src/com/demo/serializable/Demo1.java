package com.demo.serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	int i;
	int j;
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	}
public class Demo1 {

	public static void main(String[] args) throws Exception {
		A a1=new A(10,20);
		FileOutputStream fs=new FileOutputStream("I:\\NIDHI_jjj\\obj.ser");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(a1);
		os.flush();
		os.close();
		System.out.println("Done");

	}

}
