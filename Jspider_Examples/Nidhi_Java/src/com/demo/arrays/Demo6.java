package com.demo.arrays;

public class Demo6 {
	public static void main(String[] args) {
	//int[][] a=new int[3][];
		int[][] a={{1,2,3,4,5},{11,22},{999,555,444,666}};
		//Arrays.fill(a, arg1);
	//a[0]=new int[5];
	//a[1]=new int[2];
	//a[2]=new int[4];
	       
	for (int[] is : a)
	{
		for (int i : is)
		{
			System.out.print(i+",");
		}
	}
	}
}
