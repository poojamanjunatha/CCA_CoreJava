package com.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountDetails {
	public static void main(String[] args) throws Throwable, IOException {  
	    //creating instance of Account class  
	    Account acc=new Account(0, null, 0);  
	    //setting values through setter methods  
	    
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter account id:");
		int id=Integer.parseInt(br.readLine());

		System.out.println("Enter account type:");
		String type=br.readLine();

		System.out.println("Enter balance:");
		int bal=Integer.parseInt(br.readLine());
		if(bal<0) {
			System.out.println("Balance should be positive");
			System.exit(0);
		}
		int status=0;
		
		
		
			System.out.println("Enter amount to be withdrawn:");
			status =Integer.parseInt(br.readLine());
			if(bal<status)
			{
				System.out.println("Sorry!!! No enough balance");
				
			}
		
		if(bal>status)
		{
			int balance=bal-status;
			System.out.println("Balance amount after withdraw:" +balance);
		}
}
}