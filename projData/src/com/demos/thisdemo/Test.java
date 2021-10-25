package com.demos.thisdemo;






class Rect
{
	int length;
	int breath;
	Rect()
	{
		
	}
	Rect(Rect r)
	{
		length=r.length;
		breath=r.breath;
	}
	Rect(int l,int b)
	{
		this.length=l;
		this.breath=b;
	}
	void dis()
	{
		System.out.println("[length,breath]=["+length+","+breath+"]");
	}
}

class Test
{
	public static void main(String[] args) {
		
		Rect r1=new Rect();
		Rect r2=new Rect(new Rect());
		Rect r3=new Rect(20,30);
		Rect r4=new Rect(r1);
		Rect r5=new Rect(r2);
		Rect r6=new Rect(r3);
		r1.dis();
		r2.dis();
		r3.dis();
		r4.dis();
		r5.dis();
		r6.dis();
		
		
	}
	}