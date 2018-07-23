import java.util.Scanner;
class Pattern{
	void generate(int n){
		int i,j,k;
		int col=n+(n-1);
		int spaces=col-2;
		for(i=1;i<=n;i++){
			for(k=1;k<i;k++)
				System.out.print(" ");
			System.out.print(i);
			for(j=1;j<=spaces;j++)
				System.out.print(" ");
			spaces-=2;
			if(i!=n)
				System.out.print(i);
			System.out.println();
		}
	}
}
class Prog25{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		n=sc.nextInt();
		Pattern ob=new Pattern();
		ob.generate(n);
	}
}