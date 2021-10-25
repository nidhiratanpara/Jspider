package com.demo.serializable;

class B implements Cloneable
{
	int i;
	
	B(int i)
	{
		this.i=i;
	}
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
		
	}
	}
public class ColneableDemo{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		B b1=new B(100);
		Class cc=b1.getClass();
		System.out.println(cc.toString());
		System.out.println(ColneableDemo.class.isInterface());
		System.out.println(B.class.getName());
		System.out.println(Cloneable.class.isInterface());
		Cloneable c=new B(20);
		System.out.println(c.toString());
		Class fc=c.getClass();
		System.out.println(fc.getName());
		System.out.println(fc.isInterface());
		System.out.println(cc.isInterface());
		System.out.println(fc.isInterface());
		 b1=(B)b1.clone();
		System.out.println(b1.i);

	}

}
