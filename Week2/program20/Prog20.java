import java.util.Scanner;
class CheckMul{
	void check(int m,int n){
		if(m%n==0)
			System.out.println("MULTIPLE");
		else
			System.out.println("NOT MULTIPLE");
	}
}
class Prog20{
	public static void main(String args[]){
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter M and N: ");
		m=sc.nextInt();
		n=sc.nextInt();
		CheckMul ob=new CheckMul();
		ob.check(m,n);
	}
}
/*
$ java Prog20
Enter M and N: 15 5
MULTIPLE

$ java Prog20
Enter M and N: 15 7
NOT MULTIPLE
*/