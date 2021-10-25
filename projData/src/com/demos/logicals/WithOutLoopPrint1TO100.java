package com.demos.logicals;

public class WithOutLoopPrint1TO100 {
int p;

WithOutLoopPrint1TO100(int p)
{
	this.p=p;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           m1(1);
           WithOutLoopPrint1TO100 a=new WithOutLoopPrint1TO100(20);
           System.out.println(a.p);
           a=new WithOutLoopPrint1TO100(10);
           System.out.println(a.p);
	}
	
	static void m1(int i)
	{
		System.out.println(i);
		if(i==100)
			return;
		m1(i+1);
	}
}
