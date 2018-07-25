//Queue
import java.util.Scanner;
class Array
{
	int a[]=new int[100], n;
	int front=-1,rear=-1;
	void enqueue()
	{
		Scanner sc=new Scanner(System.in);
		if(rear==99) System.out.println("OVERFLOW");
		else if(front==-1){ 
			front=0;
			System.out.print("ENTER ITEM: ");
			n=sc.nextInt();
			rear++;
			a[rear]=n;
			
		}
		else{
			System.out.print("ENTER ITEM: ");
			n=sc.nextInt();
			rear++;
			a[rear]=n;
		}
	}
	void dequeue()
	{
		if(front==rear+1) System.out.println("UNDERFLOW");
		else{
		n=a[front];
		front++;
		System.out.println(n+" DEQUEUED");}
	}
	void display()
	{
		for(int i=front;i<=rear;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println();
	} 

}
class Prog3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Array ob=new Array();
		while(true)
		{
			System.out.println("PRESS 1 TO ENQUEUE");
			System.out.println("PRESS 2 TO DEQUEUE");
			System.out.println("PRESS 3 TO DISPLAY");
			System.out.println("PRESS 4 TO QUIT");
			int ch=sc.nextInt();
			switch(ch){
			case 1: ob.enqueue(); break;
			case 2: ob.dequeue(); break;
			case 3: ob.display(); break;
			case 4: System.exit(1);
			default: System.out.println("INVALID CHOICE");
			}
		}
	}
}	