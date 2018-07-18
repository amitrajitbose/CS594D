import java.util.Scanner;
class Factorial
{
	void fact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 12 : ");
		int a = sc.nextInt();
		int f=1;
		for(int i=2;i<=a;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial: "+f);
	}
}
class Prog2
{
	public static void main(String args[])
	{
		Factorial ob=new Factorial();
		ob.fact();
	}
}