package com.demo.customException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.bal=3000;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter amount");
		int amt=scn.nextInt();
		try {
			a1.withDrow(amt);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
	}

}
