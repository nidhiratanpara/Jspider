package com.demo.overridings;


class Phone
{
	void call()
	{
		System.out.println("call using 2g network");
	}
}
class CameraPhone extends Phone
{
	void call()
	{
		System.out.println("call using 3g network");
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            CameraPhone c=new CameraPhone();
            c.call();
	}

}
