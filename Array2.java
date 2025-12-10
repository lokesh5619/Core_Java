// 2D array from ( for-each loop )
class Array2
{
	public static void main(String []ar)
	{
		int x[][]={
			{10,20,30},
			{20,30,40},
			{30,40,50}
		};

        // For-each loop for 2D array
		for(int i[]:x) 
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}