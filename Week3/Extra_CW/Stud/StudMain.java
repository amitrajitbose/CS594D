import java.io.*;
import java.util.Scanner;
class Student
{
	int roll;
	String name;
	Student(int r, String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println("NAME: "+name+" ROLL: "+roll);
	}
}
class StudMain
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String name; int roll,n,i;
		System.out.print("ENTER NUMBER OF STUDENTS: ");
		n=sc.nextInt();
		Student ob[] = new Student[n];
		for(i=0;i<n;i++)
		{
			System.out.print("ENTER ROLL: ");roll=sc.nextInt();
			System.out.print("ENTER NAME: ");name=sc.nextLine();name=sc.nextLine();
			ob[i]=new Student(roll,name);
		}
		for(i=0;i<n;i++)
		{
			ob[i].display();
		}
	}
}