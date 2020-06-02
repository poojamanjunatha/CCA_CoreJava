package com.mega;

import java.util.Scanner;

public class Holiday_Trip {
	  public static void main (String []args)
	    {
	    Scanner i = new Scanner(System.in);
	    System.out.println("Enter the flight name");
	    String fname=i.next();
	  
	    System.out.println("Enter the class");
	    String b1=i.next();

	    System.out.println("Enter the number of seats");
	    int s1=i.nextInt();
	    
	    System.out.println("Card Payment");
	    String op=i.next();
	    
	  if(fname=="Air") 
	  {
		  double c=((3200*s1)-(3200*s1*(10.5/100)));
		  int value = (int)c;
		  System.out.println("the "+value);
	  }
	    }
}