package com.demos.loops;
import java.util.Scanner;

public class ifelseifloop {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int s=scn.nextInt();
		// TODO Auto-generated method stub

		int marks=9;
		if(marks>75)
		{
			System.out.println("Distiction");
		}
		else if (marks>60 && marks<70) {
			System.out.println("Frist class");
			
		}
		else if (marks>60 && marks<55) {
			System.out.println("second class");
		}
		else
		{
			System.out.println("third class");
		}
	}

}
