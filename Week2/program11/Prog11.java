import java.util.Scanner;
class LCM
{
	void lcm()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int h=0;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0){
				h=i;
			}
		}
		double lcm=(n1*n2)/h;
		System.out.println("LCM: "+lcm);
	}
}
class Prog11
{
	public static void main(String args[])
	{
		
		LCM ob=new LCM();
		ob.lcm();
	}
}