package HYD;

public class Demo_2 {

	int i = 1;
	int j = 2;

	void fun1() {
		i = j + 1;
		j = i + 1;
	}

	void fun2() {
		fun1();
		System.out.println(i);
		System.out.println(j);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_2 d2 = new Demo_2();
		d2.fun2();
		d2.fun2();
		d2.fun2();
	}

}
