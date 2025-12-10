// Prime number programme in java 
class Demo9
{	
	public static void main(String ar[])
	{ 
	int n=16;
	int i;
	int c=1;
	for(i=2; i<n; i++)
	{
		if(n%i==0)
		{
			c=0;
		}
	}
	if(c==1)
	{
		System.out.println("no. is prime");
	}
	else
	{
		System.out.println("no. is not prime");
	}
	}
	
}
	