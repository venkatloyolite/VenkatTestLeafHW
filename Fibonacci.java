package HW;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		//System.out.println(a);
		int b=1;
		int fib;
		for (int i=0;i<8;i++)
		{
			fib=a+b;
			System.out.println(fib);
			a=b;
			b=fib;
			
			
		}
			
		

	}

}
