//Check Odd Even
class Checker
{
	int n;
	void check(int n)
	{
		if(n%2==0)
			System.out.println(n+" is Even Number");
		else
			System.out.println(n+" is Odd Number");
	}
}
class Prog7
{
	public static void main(String args[])
	{
		Checker ob=new Checker();
		ob.check(10);
		ob.check(5);
	}
}