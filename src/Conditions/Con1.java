package Conditions;

import java.util.Scanner;

public class Con1 {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			int a = 0;
			System.out.println("Enter 1 no: ");
			a = s.nextInt();
			int b = 0;
			System.out.println("Enter 2 no: ");
			b = s.nextInt();
			if (a == b)
				System.out.println(a + " = " + b);
			else if (a < b)

				System.out.println(a + "is les then " + b);

			else if (a > b)
				System.out.println(a + " is greather then" + b);
		}

	}

}
