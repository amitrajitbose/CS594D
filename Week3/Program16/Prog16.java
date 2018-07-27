import java.util.Scanner;
class CountNon
{
	boolean isnonzero(int x)
	{
		if(x!=0)
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
				if(isnonzero(a[i]))
				count++;
		}
		System.out.println("The count of non zero numbers is "+count);
		
	}
}
class Prog16
{
	public static void main(String args[])
	{
		CountNon ob=new CountNon();
		ob.calc();
	}
}
