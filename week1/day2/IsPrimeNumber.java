package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// Declare a number to be checked for prime number
		int n=29,flag=1;
		for (int i =2; i < n-1; i++) {
			if(n%i==0) {
				flag=0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Given Number is a Non-Prime Number");
		}
		else
		{
			System.out.println("Given Number is a Prime Number");
		}
	}
}
