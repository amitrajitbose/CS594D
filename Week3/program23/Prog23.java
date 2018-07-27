import java.util.Scanner;
class Merge
{
	int a[],b[],c[],m,n;
	void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Size of First Array: ");
		m=sc.nextInt();
		System.out.print("Enter The Size of Second Array: ");
		n=sc.nextInt();
		a=new int[m+1];
		b=new int[n+1];
		System.out.println("Enter Values Below For First Sorted Array:");
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		a[m]=Integer.MAX_VALUE;
		System.out.println("Enter Values Below For Second Sorted Array:");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		b[n]=Integer.MAX_VALUE;
	}
	void merge(){
		int size=m+n;
		c=new int[size];
		int i=0,j=0,k=0;
		while(k<size){
			if(a[i]<=b[j]){
				c[k]=a[i];
				i++;
			}
			else if(b[j]<a[i]){
				c[k]=b[j];
				j++;
			}
			k++;
		}
		for(i=0;i<size;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();

	}
}
class Prog23
{
	public static void main(String args[])
	{
		Merge ob=new Merge();
		ob.takeInput();
		ob.merge();
	}
}