package com.methods;

public class Banking {
	static int totalAmount = 1000;

	public static void greetcustomer() {
		System.out.println("Hello welcome to the statebanking");
	}

	public void deposit(int amount) {
		totalAmount = totalAmount + amount;
		System.out.println("Amount is successfully deposited");
	}

	public void withdrawal(int amount) {
		totalAmount = totalAmount - amount;
		System.out.println("Amount is successfully withdrawal");

	}

	public int getCurrentBalance() {
		return totalAmount;
	}

	public static void main(String[] args) {
		Banking d = new Banking();
		greetcustomer();
		System.out.println("current balance " + d.getCurrentBalance());
		d.deposit(500);
		System.out.println("current balance " + d.getCurrentBalance());
		d.withdrawal(100);
		System.out.println("current balance " + d.getCurrentBalance());
d.withdrawal(1500);
System.out.println("current balance " + d.getCurrentBalance());

	}

}
