import java.util.Scanner;
class Small
{
	void calc()
	{
		int a[],size,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
		
		}
		min=a[0];
		for(int i=1;i<size;i++)
		{
			if(a[i]<min)
			min=a[i];
		}
		System.out.println("The smallest element is "+min);
		
	}
}
class Prog10
{
	public static void main(String args[])
	{
		Small ob=new Small();
		ob.calc();
	}
}
