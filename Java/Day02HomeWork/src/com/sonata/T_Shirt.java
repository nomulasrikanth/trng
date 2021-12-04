package com.sonata;

public class T_Shirt {
	String color;
	String material;
	String design;
	String Size;
	
	public T_Shirt(String co,String ma,String de,String si) {
	this.color=co;
	this.material=ma;
	this.design=de;
	this.Size=si;
	
	}
	
	public void Small() {
		
		System.out.println("This is Small size");
		
	}
	
	public void Large() {
		System.out.println("This is Large size");
		
	}
	public void ExtraLarge() {
		System.out.println("This is ExtraLarge size");
	}
	
	public void display() {
		System.out.println("Color: "+color);
		System.out.println();
		System.out.println("Material: "+material);
		System.out.println();
		System.out.println("Design: "+design);
		System.out.println();
		System.out.println("Size: "+Size);
		System.out.println();
		
	}
	
	public static void main(String[]args) {
		T_Shirt t1=new T_Shirt("pink","cotton","Fullsleave","S");
		System.out.println();
		t1.display();
		t1.Small();
		T_Shirt t2=new T_Shirt("Blue","cotton","sleaveless","L");
		System.out.println();
		t2.display();
		t2.Large();
		T_Shirt t3=new T_Shirt("Black","cotton","Fullsleave","XL");
		System.out.println();
		t3.display();
		t3.ExtraLarge();
	}
}
