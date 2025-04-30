package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8,fibo=0,n1=0,n2=1;
		System.out.println("Fibonacci Series");
		System.out.println("----------------");
		for (int i = 0; i < n; i++) {
			fibo=n1+fibo;
			n1=n2;
			n2=fibo;
			System.out.println(fibo);
		}

	}

}
