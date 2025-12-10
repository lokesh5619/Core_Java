//Array Cloning
class arrayClone
{
	public static void main(String ar[])
	{
		int x[]={10,20,33,45,50};
		int y[]=x.clone();
		System.out.println("Original x Array:- ");
		for(int arr1 : x)
		{
			System.out.println("x = "+arr1);
		}
		System.out.println("Clone y Array:- ");
		for(int arr2 : y)
		{
			System.out.println("y = "+arr2);
		}
	}
}
