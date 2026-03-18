//Fabonacci Series programme in java
class fabonacciSeries
{
	public static void main(String []ar)
	{
		int a=-1;
		int b=1;
		int c,i;
		for(i=1; i<=10; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}