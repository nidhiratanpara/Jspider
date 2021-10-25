package com.demos.classmembers;


class M
{
	
	int i;
}
class N
{
	static int i;
	int j;
	}

public class ReferenceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             M a1=new M();
             a1.i=1;
             M a2=new M();
             a2.i=2;
             M a3=new M();
             M a4=new M();
             a4.i=4;
             a1=a4;
             a2=a3;
             a3=a1;
             a4=a2;
             System.out.println(a1.i);
             System.out.println(a2.i);
             System.out.println(a3.i);
             System.out.println(a4.i);

             
             
             N n1=new N();
             n1.j=10;
             N n2=new N();
             n2.j=20;
             System.out.println(n1.j);
             System.out.println(n2.j);
            n1.i=100;
             N.i=200;
             System.out.println(n1.i);
             System.out.println(N.i);
           
           
             
             
             
             
             
             
           
	}

}
