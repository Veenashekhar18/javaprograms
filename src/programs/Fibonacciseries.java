package programs;

public class Fibonacciseries {

	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3=0;
		for(int i=1; i<=10; i++)
		{
			 fib3=fib2+fib1;
			System.out.print(fib3+" ");
			fib1=fib2;
			fib2=fib3;
			
		}
		
	}

}
