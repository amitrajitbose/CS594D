import java.util.Scanner;
class Quadratic
{
	void root()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		double px=((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
		double nx=((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
		System.out.println("Roots: "+px+","+nx);
	}
}
class Prog6
{
	public static void main(String args[])
	{
		Quadratic ob=new Quadratic();
		ob.root();
	}
}