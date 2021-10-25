package com.demo.toString;

 class Book
{
	 String title;
	Book(String t) {
		title=t;
	}
	public String toString()
	{
		return "Book[title="+title+"]";
	}
	}
public class Demo1 {

	public static void main(String[] args) {
		
         Book b=new Book("java");
         System.out.println(b);
         
	}

}
