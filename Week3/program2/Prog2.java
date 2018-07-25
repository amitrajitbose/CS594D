//Stack
import java.util.Scanner;
class Array
{
	int a[]=new int[100], n;
	int top = -1;
	void push()
	{
		if(top==99) System.out.println("OVERFLOW");
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER ITEM: ");
		n=sc.nextInt();
		top++;
		a[top]=n;
	}
	void pop()
	{
		if(top==-1) System.out.println("UNDERFLOW");
		n=a[top];
		top--;
		System.out.println(n+" POPPED");
	}
	void display()
	{
		for(int i=0;i<=top;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println();
	} 

}
class Prog2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Array ob=new Array();
		while(true)
		{
			System.out.println("PRESS 1 TO PUSH");
			System.out.println("PRESS 2 TO POP");
			System.out.println("PRESS 3 TO DISPLAY");
			System.out.println("PRESS 4 TO QUIT");
			int ch=sc.nextInt();
			switch(ch){
			case 1: ob.push(); break;
			case 2: ob.pop(); break;
			case 3: ob.display(); break;
			case 4: System.exit(1);
			default: System.out.println("INVALID CHOICE");
			}
		}
	}
}	