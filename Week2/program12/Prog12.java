import java.util.Scanner;
class Count
{
	void count()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		int n=sc.nextInt();
		int c=0;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		System.out.println("Digits= "+c);
	}
}
class Prog12
{
	public static void main(String args[])
	{
		
		Count ob=new Count();
		ob.count();
	}
}