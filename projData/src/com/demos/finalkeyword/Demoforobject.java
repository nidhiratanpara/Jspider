package com.demos.finalkeyword;

/*D
{
   final int u=666;
  
}*/
class B
{
	int i=10;
	
	final static void m1() {
		//not give a error but not require
	}
	
}
public class Demoforobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		final B b=new B();
		System.out.println(b.i);
		b.i=20;
		System.out.println(b.i);
	   //error  b1=new B();
	   // System.out.println(b1.i);
		
		final int k;
		k=55;
		System.out.println(k);

	}

}
