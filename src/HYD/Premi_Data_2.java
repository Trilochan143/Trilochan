package HYD;

public class Premi_Data_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		System.out.println("X=" + x);
		float f = 6;// implicit type casting.
		System.out.println("f=" + f);
		int i = (int) f;
		System.out.println("i=" + i);
		float f1 = f;
		System.out.println("f1=" + f1);
		double d = x;
		System.out.println("d=" + d);
		// int y=d; Error: type miss match double can not be initi.
		int y = (int) d;// explicit type casting.
		System.out.println("y=" + y);
		long b = 6; // implicit type casting int to long
		System.out.println("b=" + b);
		// int z=b; Error: type miss match long can not be initi to int.
		int z = (int) b;
		System.out.println("z=" + z);
		char ch=100;
		System.out.println("Ch="+ch);//uniqe  code value of 100 
		int c=(int)ch;
		System.out.println("C="+c);
	}

}
