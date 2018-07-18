import java.util.Scanner;
class HCF
{
	void hcf()
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
		System.out.println("HCF= "+h);
	}
}
class Prog10
{
	public static void main(String args[])
	{
		
		HCF ob=new HCF();
		ob.hcf();
	}
}