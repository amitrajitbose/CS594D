import java.util.Scanner;
class SumNat
{
	void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		int n=sc.nextInt();
		int sum= (n*(n+1))/2;
		System.out.println("Sum: "+sum);
	}
}
class Prog7
{
	public static void main(String args[])
	{
		SumNat ob=new SumNat();
		ob.sum();
	}
}