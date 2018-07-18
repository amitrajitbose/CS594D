import java.util.Scanner;
class Buzz
{
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
		if(a%10==7 || a%7==0)
		System.out.println("Buzz Number");
		else
		System.out.println("not Buzz Number");
	}
}
class Prog1
{
	public static void main(String args[])
	{
		Buzz ob=new Buzz();
		ob.check();
	}
}