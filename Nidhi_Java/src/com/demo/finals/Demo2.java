package com.demo.finals;
class B
{
	 static final int j; 
	static
	{
		j=50;
	}
	 final int n=10;
	 B()
	 {
		 final int n; 
	 }
	 {
		 final int h; 
	 }
	int I=10;
	static void m2()
	{
		System.out.println("hello");
	}
  final static void m1()
  {
	  System.out.println("hii");
  }
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 final int j=100;
		 System.out.println(j);
		//System.out.println(j);
          final B b=new B();
         System.out.println(b.I);
         b.I=500;
         System.out.println(b.I);
         B.m1();
         B.m2();
         //b=new B();
	}

}
