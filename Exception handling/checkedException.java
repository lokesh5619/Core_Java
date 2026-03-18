// checked exception
import java.io.*;
class Demo9
{
	static public void main(String ar[]) // 10 2 , 10 0
	{
		System.out.println("softwaves__1");
		PrintWriter pw=new PrintWriter("xyz.txt");
		pw.print("softwaves");
		pw.close(); 
		System.out.println("softwaves__2");
	}
}
