import java.util.Scanner;
class Rev
{
	void doRev()
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
		System.out.println("Reverse: "+r);
	}
}
class Prog4
{
	public static void main(String args[])
	{
		Rev ob=new Rev();
		ob.doRev();
	}
}