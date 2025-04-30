package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		// Declare the number to be checked for palindrome
		int n=12121,rem,s=0;
		for(int i=n;i>0;i=i/10) {
			rem=i%10;
			s=s*10+rem;
		}
		if(s==n) {
			System.out.println("Given Number is Palindrome");
		}
		else
			System.out.println("Given Number is not a Palindrome");

	}

}
