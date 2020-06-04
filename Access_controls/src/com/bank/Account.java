package com.bank;

public class Account {
	private static int accountid;
    private static String accountType;
   private static int balance;
   
   public static int getaccountid() {
		return accountid;
	}
 public static String getaccountType() {
	 return accountType;
	 
 }
     public static int getbalance() {
    	 return balance;
     }
     public Account(int accountid, String accountType,int balance) 
 	{
 		this.accountid = accountid;
 		this.accountType = accountType;
 		this.balance = balance;
 		
 	}

}


