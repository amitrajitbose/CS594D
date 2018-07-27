import java.util.Scanner;
class CountPrime
{
	boolean isprime(int x)
	{
		int flag=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0&&x!=1&&x!=0)
		return true;
		else
		return false;
	}
	void calc()
	{
		int a[],size,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		size=sc.nextInt();
		a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter an element");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
				if(isprime(a[i]))
				count++;
		}
		System.out.println("The count of prime numbers is "+count);
		
	}
}
class Prog14
{
	public static void main(String args[])
	{
		CountPrime ob=new CountPrime();
		ob.calc();
	}
}
