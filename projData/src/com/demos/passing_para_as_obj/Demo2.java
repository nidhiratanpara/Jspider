package com.demos.passing_para_as_obj;


class Z
{
      int i;
      Z(int i)
      {
    	  this.i=i;
      }
      void m(A a)
      {
    	  System.out.println("only i"+i);
    	  System.out.println("i with this"+this.i);
    	  System.out.println("i with z"+a.i);
    	  System.out.println("==========");
    	 
    	  
      }
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Z z=new Z(10);
         z.m(new A(20));
         Z z1=new Z(30);
         z1.m(new A(40));
         
	}

}
