/*
  1
 212
32123 
*/
import java.util.Scanner;
class Pattern{
	void generate(int n){
		int i,j,k;
		int col=n+(n-1);
		int halfway=(col-1)/2;
		for(i=1;i<=n;i++){
			for(j=1;j<=halfway;j++)
				System.out.print("  ");
			halfway--;
			for(k=i;k>=1;k--)
				System.out.print(k+" ");
			for(k=2;k<=i;k++)
				System.out.print(k+" ");
			System.out.println();
		}
	}
}
class Prog24{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		n=sc.nextInt();
		Pattern ob=new Pattern();
		ob.generate(n);
	}
}