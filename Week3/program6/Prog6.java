//Search
import java.util.Scanner;
class Array
{
	int a[],m;
	Scanner sc=new Scanner(System.in);
	void takeInput()
	{
		System.out.print("ENTER SIZE: ");
		m=sc.nextInt();
		a=new int[m];
		
		System.out.print("ENTER VALUES OF ARRAY: ");
		for(int i=0;i<m;i++)
		{	
			a[i]=sc.nextInt();
		}
	}
	void search()
	{
		int flag=0;
		System.out.println("ENTER SEARCH ELEMENT: ");
		int key=sc.nextInt();
		for(int i=0;i<m;i++)
		{
		if(a[i]==key){
		System.out.println("FOUND"); flag=1; break; }
		}
		if(flag==0)
		System.out.println("NOT FOUND");
		
		
	}
}
class Prog6
{
	public static void main(String[] args)
	{
		Array ob=new Array();
		ob.takeInput();
		ob.search();
	}
}	
			