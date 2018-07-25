import java.util.Scanner;
class Array
{
	int a[], n;
	void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER SIZE OF ARRAY: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.print("ENTER VALUES: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	void sumAvg()
	{
		int sum = 0;
		double avg;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println("SUM= "+sum);
		System.out.println("AVERAGE= "+(sum/n));
	}
}
class Prog1
{
	public static void main(String[] args)
	{
		Array ob=new Array();
		ob.takeInput();
		ob.sumAvg();
	}
}	
					 