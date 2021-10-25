package com.demos.passing_para_as_obj;



class Y
{
	
	int a;
	Y(int a)
	{
		this.a=a;
	}
	void show(Y y)
	{
		System.out.println(a);
		System.out.println(y.a);
		System.out.println("==========");
	}

}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   Y y1=new Y(100);
                   Y y2=new Y(200);
                   y1.show(y2);
                   y2.show(y1);
                   y2.show(new Y(50));
                   new Y(60).show(new Y(70));
                   
	}

}
