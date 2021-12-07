package com.sonata;

public class UsingPeople {
	public static void main(String[] args) {
		
		
		TechnicalEmployee T = new TechnicalEmployee(21275, "karthik", "Hyd", 26000, 10);
		
		Staff S = new Staff(21266, "Srikanth", "Jangaon", 360000, 6);
		
		T.display();
		System.out.println("Technical Employee Sal is : "+T.calculateSal());
		
		System.out.println("\n");
		S.display();
		System.out.println("Staff Sal is : "+S.calculateSal());
		
	}



}
