import java.util.Scanner;
class SecondHigh
{
	int n,m;
	float a[],b[];
	void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Size of First Array ");
		m=sc.nextInt();
		a=new float[m];
		System.out.println("Enter Values Below:");
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextFloat();
		}
		//Now second array
		System.out.print("Enter The Size of Second Array ");
		n=sc.nextInt();
		b=new float[n];
		System.out.println("Enter Values Below:");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextFloat();
		}
	}
	void merge(){
		int i;
		float c[]=new float[m+n];
		for(i=0;i<m;i++){
			c[i]=a[i];
		}
		for(i=0;i<n;i++){
			c[i+m]=b[i];
		}
		//merged
		System.out.print("Merged Array\n");
		for(i=0;i<m+n;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}
}
class Prog17
{
	public static void main(String args[])
	{
		SecondHigh ob=new SecondHigh();
		ob.takeInput();
		ob.merge();
	}
}