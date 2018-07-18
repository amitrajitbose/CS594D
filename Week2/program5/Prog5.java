import java.util.Scanner;
class Admission
{
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Maths marks: ");
		int m = sc.nextInt();
		System.out.print("Enter Physics marks: ");
		int p = sc.nextInt();
		System.out.print("Enter Chemistry marks: ");
		int c = sc.nextInt();
		if(m>=60 && p>=50 && c>=40 && (((p+c+m) >= 200) || ((p+m) >=150))){
		System.out.println("ELIGIBLE");
		}
		else{
		System.out.println("NOT ELIGIBLE");
		}
	}
}
class Prog5
{
	public static void main(String args[])
	{
		Admission ob=new Admission();
		ob.check();
	}
}