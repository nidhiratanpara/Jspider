package com.demos.constructor;



class Emp
{
	
	String name;
	double sal;
	
	Emp(String n,double d)
	{
		name=n;
		sal=d;
	}
	}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Emp e1=new Emp("RAJA",1000);
        Emp e2=new Emp("RANI",2000);
        System.out.println(e1.name+" "+e1.sal);
        System.out.println(e2.name+" "+e2.sal);
	}

}
