package com.demos.classmembers;
 class F
 {
	int i;
	void m()
	{
		System.out.println(i);
	}
 }
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            F f=new F();
            f.m();
            f.i=10;
            f.m();
            F g=new F();
            g.i=30;
            g.m();
            F d=new F();
            System.out.println(d);
            // d store a address when new obj created new add apply
            d.i=100;
            System.out.println(d.i);
            d=new F();
            System.out.println(d);
            System.out.println(d.i);
	}

}
