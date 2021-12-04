package com.sonata;

public class Product {
	int proid;
	String proname;
	double proprice;
	
	Product()
	{
		
	}
	
	
	
	 public double add(double GST)
	 {
		 proprice=proprice+GST;
		 return proprice;
	 }
	
	
	public void display()
	{
		System.out.println(proid);
		System.out.println(proname);
		System.out.println(proprice);
	}


public static void main(String args[])
{
	Product p = new Product();
	p.proid= 21266;
	p.proname = "car";
	p.proprice = 100000;
	p.display();
	System.out.println(p.add(10.05));
	
	
}


}
