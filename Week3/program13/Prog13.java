import java.util.Scanner;
class CheckSparse
{
	void takeInputAndCheck()
	{
		int r,c,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter Values Below:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				if(a[i][j]==0)
					count++;
			}
		}
		if(count>((r*c)/2))
			System.out.println("SPARSE");
		else
			System.out.println("NOT SPARSE");
	}
}
class Prog13
{
	public static void main(String args[])
	{
		CheckSparse ob=new CheckSparse();
		ob.takeInputAndCheck();
	}
}