import java.util.Scanner;
class Commission
{
	int sales;
	Commission(int s)
	{
		sales=s;
	}
	int commission(int r)
	{
		int com=sales*r/100;
		return com;
	}
}
class Prog28
{
	public static void main(String args[])
	{
		int sale,rate,comm;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for sales");
		sale=sc.nextInt();
		if(sale<0)
			System.out.println("Invalid Input");
		else
		{
			Commission ob=new Commission(sale);
			System.out.println("Enter the rate at which commission is to be calculated");
			rate=sc.nextInt();
			comm=ob.commission(rate);
			System.out.println("The Commission is "+comm);
		}
	}
}

		
