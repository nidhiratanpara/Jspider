package com.demos.classmembers;


class H
{
	static int i;
	int j;

	void inc()
	{
		i++;
		j++;
	}
	
	void disply()
    {
		System.out.println(i);
		System.out.println(j);
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    H h1=new H();
    H h2=new H();
    H h3=new H();
   /* h1.inc();
    h2.inc();
    h3.inc();
    h1.disply();
    h2.disply();
    h3.disply();*/
    
    /*h1.inc();
    h1.disply();
    h2.inc();
    h2.disply();
    h3.inc();
    h3.disply();*/
    
    h1.inc();
    h1.disply();
    h1.inc();
    h2.disply();
    h1.inc();
    h3.disply();
	}

}
