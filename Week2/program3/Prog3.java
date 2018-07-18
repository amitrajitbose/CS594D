import java.util.Scanner;
class Fibs
{
	void fiboGen()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}
class Prog3
{
	public static void main(String args[])
	{
		Fibs ob=new Fibs();
		ob.fiboGen();
	}
}