package com.mega;

import java.util.Scanner;

public class Count_digit {
	static  int count1 = 0;
	   public static void main(String[] args) {

		   Scanner i=new Scanner (System.in);
		 double num=i.nextDouble();

		double count = 0;
    
        
        int b=Integer.toString((int) num).length();
        //System.out.println(b);
        if(b>9) {
        	System.out.println(num+ " exceeds the limit");
        }
        else if(b<0) {
        	System.out.println(" falls behind the limit");
        }
        else if(b<=9) {
        	int num1=(int)num;
        	System.out.println(num1);
        
        	 
        	 int d1=i.nextInt();
        	 int d=Integer.toString((int) d1).length();
        	 if(d>=2) {
        		 System.out.println("is not valid");
        	 }
        	 if(d<2) {
        	 
        	    while (num1 > 0)  
        	    { 
        	  
        	        // check if the digit is D 
        	        count1 = (num1 % 10 == d1) ?  
        	                    count1 + 1 : count1; 
        	        num1 = num1 / 10; 
        	    } 
        	    {
        	    	do {
        		        if (num % 10 == d){
        		            System.out.println("t");
        		        }
        		        num /= 10;
        		   } while (num > 0);
        		 System.out.println("f");
        	}
        	} 
        	    
        
        int n=(int)num;
        	    System.out.println("Count of "+d1+" in " + num+" is " +count1);	  
        
        }
        }
	  
}