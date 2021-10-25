package com.demo.factory;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter type of light");
		String type=scn.next();
		scn.close();
		ISwitch sw=LightFactory.getLight(type);
		if(sw!=null)
		{
			sw.sOn();
			sw.sOff();
		}
		
		
	}

}
