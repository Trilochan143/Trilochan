package HYD;

public class Demo_1 {
	int i = 2;
	int j = 3;

	void fun() {
		i = j + 1;
		j = i + 1;
		System.out.println(i);
		System.out.println(j);
	System.out.println("From fun1()");
	}

	public static void main(String[] args) {
		Demo_1 d1 = new Demo_1();
		
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println();
		d1.fun();
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println(d1);
	}

}
