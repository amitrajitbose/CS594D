import java.util.Scanner;
class Expo
{
	void pow()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base & Index: ");
		int b=sc.nextInt();
		int r=1;
		int e=sc.nextInt();
		for(int i=1;i<=e;i++)
		{
			r=r*b;
		}
		System.out.println("Result= "+r);
	}
}
class Prog13
{
	public static void main(String args[])
	{
		
		Expo ob=new Expo();
		ob.pow();
	}
}