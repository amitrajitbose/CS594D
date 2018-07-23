//Check Armstrong number
import java.util.Scanner;
class CheckArmst{
	void check(int n){
		int num=n;
		int r=0;
		while(num>0){
			r=r+(int)Math.pow((num%10),3);
			num/=10;
		}
		if(r==n)
			System.out.println("ARMSTRONG");
		else
			System.out.println("NOT ARMSTRONG");
	}
}
class Prog22{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		n=sc.nextInt();
		CheckArmst ob=new CheckArmst();
		ob.check(n);
	}
}