package com.demo.arrays;

class Book
{
	String title;
	Book(String s)
	{
		title=s;
	}
	public String toString()
	{
		return title;
		
	}
	}
public class Demo4 {

	public static void main(String[] args) {
		Book[] b=new Book[5];
		b[0]=new Book("c");
		b[1]=new Book("java");
		b[2]=new Book("c++");
		
		for (Book book : b) {
			System.out.println(book);
		}
	}

}
