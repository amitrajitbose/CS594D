import java.util.Scanner;
class Prime
{
	void prime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Numbers: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
			c=1;break;
			}
		}
		if(c==1 || n==1)
		System.out.println("NOT PRIME");
		else if(c==0)
		System.out.println("PRIME");
	}
}
class Prog15
{
	public static void main(String args[])
	{
		
		Prime ob=new Prime();
		ob.prime();
	}
}