package com.ameer.example;

import java.util.Scanner;

public class nnn {
	double totalamount;
	double balance;
	long accountno;
	double enteramount;
	double debit;

	public static void main(String[] args) {
		nnn L = new nnn();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Account Number");
		L.accountno = Sc.nextLong();

		if (L.accountno == 1234) {
			System.out.println("Enter amount to send");
			L.enteramount = Sc.nextDouble();
			L.totalamount = 6000;
			System.out.println("Bank name :SBI.....>" + " " + L.totalamount);
			L.debit = L.totalamount - L.enteramount;
			System.out.println(L.debit + " " + "is your remaining balance");
			
		} else if (L.accountno != 1234) {
			System.out.println("Invalid account number");
		}

	}

}
