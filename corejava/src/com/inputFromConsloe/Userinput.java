package com.inputFromConsloe;

import java.util.Scanner;


public class Userinput {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the your name?");
		String name = sc.nextLine();
		String exp="venkey";
		if(name.equals(exp)) {
		System.out.println("Hey how are you "+name);
		System.out.println("what was the day "+ name);
		String name2= sc.nextLine();
		System.out.println("oka "+name);
		System.out.println("what is your age  "+name);
		int age = sc.nextInt();
		System.out.println("thankyou for giving the information..... "+name);
		}
		else {
			System.out.println("This is worng user name");
			System.out.println("Press Enter...");
			String stop = sc.nextLine();
			System.out.println("better luck next time..");
		}

	}
}