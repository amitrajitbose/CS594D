import java.util.Scanner;
class PrintAlt
{
	void print()
	{
		int a[],size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
		}
		System.out.println("The original array is ");
		for(int i=0;i<size;i++)
		{
				System.out.print(a[i]+",");
		}
		System.out.println("\nThe array with alternate elements is");
		for(int i=0;i<size;i+=2)
		{
				System.out.print(a[i]+",");
		}
		
	}
}
class Prog22
{
	public static void main(String args[])
	{
		PrintAlt ob=new PrintAlt();
		ob.print();
	}
}
