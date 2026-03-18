// checked exception
import java.io.*;
import java.io.FileNotFoundException;
class Demo9
{
	static public void main(String ar[]) throws FileNotFoundException
	{
		System.out.println("softwaves__1");
		PrintWriter pw=new PrintWriter("xyz.txt");
		pw.print("softwaves");
		pw.close(); 
		System.out.println("softwaves__2");
	}
}
