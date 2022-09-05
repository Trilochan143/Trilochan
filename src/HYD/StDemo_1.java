package HYD;

public class StDemo_1 {
	
	int i,j;
	static int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x=10; //Static var
		System.out.println("Static x="+x);//Static var
		//i= 10 instance or local var.
		StDemo_1 d2= new StDemo_1();
		d2.i=20;
		d2.j=30;
		System.out.println("Local i="+d2.i);
		System.out.println("Local j="+d2.j);
		
	}

}
