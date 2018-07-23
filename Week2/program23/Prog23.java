/*
1
234
56789
*/

import java.util.Scanner;
class Pattern{
	void generate(int n){
		int i,j,k;
		k=1;
		for(i=1;i<=n;i+=2){
			for(j=1;j<=i;j++){
				if(k>n)
					System.exit(0);
				else{
					System.out.print(k+"\t");
					k++;
				}
			}
			System.out.println();
		}
	}
}
class Prog23{
	public static void main(String args[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		n=sc.nextInt();
		Pattern ob=new Pattern();
		ob.generate(n);
	}
}