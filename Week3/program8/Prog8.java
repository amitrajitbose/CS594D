import java.util.Scanner;
class SumDiag
{
	void calc()
	{
		int a[][],r,c,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			System.out.println("Enter an element");
			a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				sum=sum+a[i][i]+a[i][r-i-1];
			}
		}
		sum=sum-a[r/2][c/2];

		System.out.println("The sum is "+sum);
		
	}
}
class Prog8
{
	public static void main(String args[])
	{
		SumDiag ob=new SumDiag();
		ob.calc();
	}
}