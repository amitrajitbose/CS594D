import java.util.Scanner;
class Mul
{
	void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		System.out.print("Enter Limit: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.println(num+" x "+i+" = "+(num*i));
	}
}
class Prog9
{
	public static void main(String args[])
	{
		
		Mul ob=new Mul();
		ob.sum();
	}
}