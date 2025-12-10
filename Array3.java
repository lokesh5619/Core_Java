// 3D Array for each loop
class Array3 
{
	public static void main(String []ar)
	{
		int x[][][]={
			{{10,20,30,23},{20,23,30,40},{20,12,30,40}},
			{{20,30,40,23},{30,40,23,50},{20,30,40,32}},
			{{30,40,50,23},{43,40,50,60},{33,20,30,40}},
			{{30,40,50,22},{40,50,60,54},{20,30,40,23}},
			{{30,40,50,22},{40,50,60,54},{20,30,40,45}},
		};
		for(int i[][]:x)
		{
			for(int j[]:i)
			{
				for(int z:j)
				{
					System.out.print(z+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}