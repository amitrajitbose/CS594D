//Sum of two 2D array
import java.util.Scanner;
class Array
{
	int a[],m;
	void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER SIZE: ");
		m=sc.nextInt();
		a=new int[m];
		
		System.out.print("ENTER VALUES OF ARRAY: ");
		for(int i=0;i<m;i++)
		{	
			a[i]=sc.nextInt();
		}
	}
	void range()
	{
		int min=a[0],max=a[0];
		for(int i=1;i<m;i++)
		{
		if(a[i]>max)
		max=a[i];
		if(a[i]<min)
		min=a[i];
		}
		System.out.println("RANGE= "+min+","+max);
		
	}
}
class Prog5
{
	public static void main(String[] args)
	{
		Array ob=new Array();
		ob.takeInput();
		ob.range();
	}
}	
				