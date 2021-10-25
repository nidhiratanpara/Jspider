package com.demos.comparatar;
import java.util.Arrays;
import java.util.Comparator;




public class Demo1 {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] arr= {"java","c++","kotlin","c",".net"};
		
		Arrays.sort(arr,new Lencomprator());
		for (String s : arr) {
			
			System.out.println(s);
			
		}
	}

}
class Lencomprator implements Comparator
{

	@Override
	public int compare(Object x, Object y) {
		// TODO Auto-generated method stub
		return(((String)x).length()-((String)y).length()) ;
	}
	}




