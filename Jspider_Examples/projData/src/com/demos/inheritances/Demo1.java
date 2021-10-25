package com.demos.inheritances;


class X
{
	
	int i=10;
	void m1()
	{
		System.out.println(i);
	}
	}
class Yes extends X
{
  int j=20;
  void m2()
  {
	  System.out.println(i);
	  System.out.println(j);
  }
	}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Yes ya=new Yes();
       ya.m1();
       ya.m2();
       
	}

}
