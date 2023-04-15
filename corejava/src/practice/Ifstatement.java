package practice;

import java.util.Iterator;
import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i <100; i++) {
			System.out.println("enter the number");
			int num = sc.nextInt();
int j=num;
if (i%2==0) {
	System.out.println(i+" i is evenumber");
}
		else {
			System.out.println(i+" i is oddnumber");

		}
		
		}
	}

}
