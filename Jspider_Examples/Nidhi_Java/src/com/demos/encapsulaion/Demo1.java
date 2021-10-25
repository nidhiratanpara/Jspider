package com.demos.encapsulaion;

class Emp
{
	private String name;
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Emp e=new Emp();
      e.setName("nidhi");
      String ss=e.getName();
      System.out.println(ss);
	}

}
