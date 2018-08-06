import java.util.Scanner;
class Grader
{
	int marks;
	Grader(int n)
	{
		marks=n;
		//letterGrade();
	}
	char letterGrade(){
	char g;
	if(marks>=90) g='O';
	else if(marks>=80) g='E';
	else if(marks>=70) g='A';
	else if(marks>=60) g='B';
	else if(marks>=40) g='C';
	else g='F';
	return g;
	}
}
class Prog27
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ENTER MARKS: ");
		int m=sc.nextInt();
		Grader obj = new Grader(m);
		System.out.println("GRADE: "+obj.letterGrade());
	}
}
