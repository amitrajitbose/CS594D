import java.util.Scanner;
class MulTen
{
	void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Lower & Upper Limit: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
			System.out.println(10*i);
	}
}
class Prog8
{
	public static void main(String args[])
	{
		
		MulTen ob=new MulTen();
		ob.sum();
	}
}