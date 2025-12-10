class arrayPalindrome
{
	public static void main(String []ar)
	{
		int x[]={1,2,3,2,1};
		int y[]= new int[5];
		for(int j=0; j<x.length; j++)
		{
			y[x.length-1-j]=x[j];
		}

		boolean z=true;

		for(int i=0; i<y.length; i++)
		{
			// System.out.println("y= "+y[i]);
			if(x[i] != y[i])
			{
				z=false;
				break;
			}
		}
		if(z)
			System.out.println("Array is Palindrome");
		else
			System.out.println("Array is not Palindrome");
	}
}

