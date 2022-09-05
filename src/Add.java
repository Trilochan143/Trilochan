import java.util.Scanner;
public class Add {

	
	Scanner in = new Scanner(System.in);

	public Add() {
	
		
		System.out.println("Enter to int numbers");
		int a1 = in.nextInt();
		
		System.out.println("Enter second no:");
		int b1 = in.nextInt();
		int c= a1+b1;
		System.out.println("Sum:"+c);
			}
public void welcome()
{
	System.out.println("Welcome to java basics");
	}
	public static void main(String[] args) {
		Add ad= new Add();
		ad.welcome();
	}

}
