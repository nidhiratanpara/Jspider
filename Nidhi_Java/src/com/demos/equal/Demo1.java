package com.demos.equal;
class Circle
{
	int riduas;
	 Circle(int r)
	 {
		riduas=r;
	}
	 public boolean equals(Object arg) {
		if(!(arg instanceof Circle))
			return false;
		return riduas==((Circle)arg).riduas;
	}
	}
public class Demo1 {
	public static void main(String[] args) {
		int a=5;
		int b=5;
		System.out.println(a==b);
		System.out.println("***********************");
		Circle c1=new Circle(10);
		Circle c2=new Circle(10);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.riduas==c2.riduas);
		System.out.println("=========================");
		Integer i1=20;
		Integer i2=20; 
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println("=========================");
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("=========================");
		
		String sc="abc";
		String ss=new String("abc");
		System.out.println(ss==sc);
		System.out.println(ss.equals(sc));
		
		System.out.println("=================+++++++++++++==================");
		Integer ip1=10;
		Integer ip2=new Integer(10);
		System.out.println(ip1==ip2);
		System.out.println(ip1.equals(ip2));
		
		
		
		
		/*Integer I1= new Integer(10);
		Integer I2= new Integer(10);
		System.out.println(I1.equals(I2));
		System.out.println("gghgh");
		Integer I5= 10;
		I2= new Integer(20);
		System.out.println(I1.equals(I2));
		
		StringBuffer aa = new StringBuffer("ABC");
		String bb = new String("ABC");*/
		
		//System.out.println(aa==bb);
/*		System.out.println(aa.equals(bb));
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(I1==I2);
		System.out.println(I1.equals(I2));*/
	}

}
