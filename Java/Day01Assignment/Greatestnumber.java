package com.sonata;

public class Greatestnumber {
public static void main(String args[]) {
	int a=12,b=25,c=89;
	if(a>=b && a>=c)
		 System.out.println(a+ "is the largest number");
	else if(b>=a && b>=c)
		System.out.println(b+ "is the largest number");
	else
		System.out.println(c+ " is the largest number");
}
}
