import java.util.Scanner;
class Transpose
{
	void calc()
	{
		int a[][],b[][],r,c,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		a=new int[r][c];
		b=new int[c][r];
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
				b[j][i]=a[i][j];
			}
		}
		System.out.println("The original matrix is :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The transposed matrix is :");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}
}
class Prog12
{
	public static void main(String args[])
	{
		Transpose ob=new Transpose();
		ob.calc();
	}
}
