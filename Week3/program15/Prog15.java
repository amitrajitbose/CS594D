import java.util.Scanner;
class SecondHigh
{
	int n,a[];
	void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Size");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter Values Below:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	void find(){
		int f=(a[0]>a[1])?a[0]:a[1];
		int s=(a[0]+a[1])-f;
		for(int i=2;i<n;i++){
			if(a[i]>f){
				s=f;
				f=a[i];
			}
		}
		System.out.println("Second Highest Element: "+s);
	}
}
class Prog15
{
	public static void main(String args[])
	{
		SecondHigh ob=new SecondHigh();
		ob.takeInput();
		ob.find();
	}
}