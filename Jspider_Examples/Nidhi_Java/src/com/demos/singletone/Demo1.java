package com.demos.singletone;

public class Demo1 {
	private static Demo1 obj;
	private Demo1()
	{
		
	}
	public static Demo1 getInst()
	{
		if(obj==null)
		{
			obj=new Demo1();
			System.out.println(obj);
		}
		System.out.println(obj);
		return obj;
		
	}

	public static void main(String[] args) {
		
        Demo1 d1=Demo1.getInst();
        Demo1 d2=obj.getInst();
        System.out.println(d1);
        System.out.println(d2);
	}

}
