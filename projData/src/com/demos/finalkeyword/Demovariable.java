package com.demos.finalkeyword;

public class Demovariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            final int I=10;
            System.out.println(I);
            int i=I+20;
            System.out.println(i);
           //error  I+=20;
           //error  I++;
           //error  I=60;
            i+=90;
            System.out.println(i);
            i++;
            System.out.println(i++);
            i=900;
            System.out.println(i);
	}

}
