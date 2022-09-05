package Conditions;

import java.util.Scanner;

public class Con2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 No:");
		int a = sc.nextInt();
		System.out.println("enter 2 No:");
		int b = sc.nextInt();
		if (a > b)
			System.out.println(a + " is greather then " + b);
		else
			System.out.println(a + " is less then" + b);
		sc.close();

	}

}
