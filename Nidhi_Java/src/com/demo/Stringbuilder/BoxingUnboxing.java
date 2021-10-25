package com.demo.Stringbuilder;

public class BoxingUnboxing {
public static void main(String[] args) {
	int i=10;
	Integer obj=new Integer(i);
	System.out.println(obj);
	
	int j=obj.intValue();
	System.out.println(j);
	
	Integer i1=20;
	Integer i2=30;
	System.out.println(i1*i2);
	
	
	Object o1=110;
	System.out.println(o1);
	System.out.println((Integer)o1*10);
	
	Boolean b=true;
	Object[] a={10,20,30,50};
	for (Object object : a) {
		System.out.println((int)object+10);
	}
	
}
}
