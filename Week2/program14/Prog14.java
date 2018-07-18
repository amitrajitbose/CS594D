import java.util.Scanner;
class Palin
{
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
		int num=a;
		int d,r;
		r=0;
		while(num>0){
			d=num%10;
			r=(r*10)+d;
			num/=10;
		}
		if(a==r)
		System.out.println("PALINDROME");
		else
		System.out.println("NOT PALINDROME");
	}
}
class Prog14
{
	public static void main(String args[])
	{
		
		Palin ob=new Palin();
		ob.check();
	}
}