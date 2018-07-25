//Sum of two 2D array
import java.util.Scanner;
class Array
{
	int a[][],b[][], m,n;
	void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER ROW and COLUMN OF ARRAY: ");
		m=sc.nextInt();n=sc.nextInt();
		a=new int[m][n];
		b=new int[m][n];
		System.out.print("ENTER VALUES OF FIRST MATRIX: ");
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)	
			a[i][j]=sc.nextInt();
		}
		System.out.print("ENTER VALUES OF SECOND MATRIX: ");
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)	
			b[i][j]=sc.nextInt();
		}
	}
	void matAdd()
	{
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)	
		a[i][j]+=b[i][j];
		}

		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)	
			System.out.print(a[i][j]+" ");
		System.out.println();
		}
		
	}
}
class Prog4
{
	public static void main(String[] args)
	{
		Array ob=new Array();
		ob.takeInput();
		ob.matAdd();
	}
}	
					 