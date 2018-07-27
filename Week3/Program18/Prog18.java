import java.util.Scanner;
class AddArray
{
	void add()
	{
		int a[],b[],sum[],size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		size=sc.nextInt();
		a=new int[size];
		b=new int[size];
		sum=new int[size];

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element for Array1");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element for Array2");
			b[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum[i]=a[i]+b[i];
		}

		System.out.println("The Resultant Sum Array is ");
		for(int i=0;i<size;i++)
		{
				System.out.print(sum[i]+",");
		}
		
		
	}
}
class Prog18
{
	public static void main(String args[])
	{
		AddArray ob=new AddArray();
		ob.add();
	}
}
