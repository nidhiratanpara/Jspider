package com.demo.interfaces;

interface Flyable
{
	void fly();
	}
interface Drivable
{
	void Drive();
	}
class Pro5 implements Flyable,Drivable
{

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println("pro5 is driveing");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("pro5 is flying");
	}
	}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
           /* Pro5 ff=new Pro5();
            ff.Drive();
            ff.fly();*/
            Flyable f=new Pro5();
            Drivable d=new Pro5();
            f.fly();
            d.Drive();
	}

}
