package com.mmcoe.bank;

public class TestAccounts {
	public static void main(String[] args) {
		
		
		Accounts ac =new Accounts(5000);
		System.out.println(ac);   //bal:5000 OD:10000
		
		try {
			ac.withdrw(5000);

		}catch (BalanceException e) {

		            // Developer Troubleshooting
		            e.printStackTrace();

		            // Logging / Audit System
		            System.out.println(e);

		            // End User Message
		            System.out.println(e.getMessage());
		        }
//		ac.withdrw(3000);
//
//		System.out.println(ac);		//bal:2000 OD:10000
//		
//		ac.withdrw(7000);
//		System.out.println(ac);		//bal:0  OD:5000
//		
//		ac.deposit(2000);
//		System.out.println(ac);		//bal:0  OD:7000
//		ac.deposit(50000);
//		System.out.println(ac);		//bal:2000  OD:10000
	}

}
