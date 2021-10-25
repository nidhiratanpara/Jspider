package com.demo.aggrigtion;

class Address
{
	String city;
	String state;
	String country;
	 Address(String c,String s,String co) {
		this.city=c;
		this.state=s;
		this.country=co;
		
	}
	 public void display()
	 {
		 System.out.println(city+","+state+","+country);
	 }}
class Student
{
	String name;
	int id;
	Address add;
	 Student(String n,int i,Address ad) {
		this.name=n;
		this.id=i;
		this.add=ad;
	}
	 public void displaustudentinfo()
	 {
		 System.out.println("Name:"+name);
		 System.out.println("Id:"+id);
		 System.out.println("Address:");
		add.display();
		 
	 }
	}
public class Demo2 {

	public static void main(String[] args) {
		Address a=new Address("pune", "maharashtra", "India");
		Student stu=new Student("nidhi", 100, a);
		stu.displaustudentinfo();

	}

}
