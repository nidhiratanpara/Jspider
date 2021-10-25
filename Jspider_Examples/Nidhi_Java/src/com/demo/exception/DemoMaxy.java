package com.demo.exception;

public class DemoMaxy {
	
	int i;
	DemoMaxy (int k)
	{
			i=k;
}
	protected void finalize(){
		System.out.println("This object has been removed");
	}
	
	public void getI(){
		System.out.println("This is " + i);
	}

	public static void main(String[] args) {
		DemoMaxy d = new DemoMaxy(10);
		d.getI();
		d=new DemoMaxy(20);
		//System.gc();
Runtime r = Runtime.getRuntime();
r.gc();
	}

}
