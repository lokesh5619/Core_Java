// Palindrome number programme in java
class palindrome
{
	public static void main(String []ar)
	{
		int n=261;
		int s=0;
		int a;
		int n1=n;
		while(n!=0)
		{
		a=n%10;
		s=s*10+a;
		n=n/10;
		}
		if(n1==s)
			System.out.println("no is palindrome");
		else
			System.out.println("no is not palindrome");
	}
}