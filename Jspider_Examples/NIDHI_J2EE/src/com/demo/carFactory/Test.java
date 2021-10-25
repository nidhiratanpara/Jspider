package com.demo.carFactory;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter which type car");
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		scn.close();
		IKey ik=CarFactory.getCar(s);
		if(ik != null)
		{
			ik.kOn();
			ik.kOff();
			
		}
	}

}
