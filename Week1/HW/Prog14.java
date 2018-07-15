//check divisibility by 5

class Checker
{
	void check(int n)
	{
		if(n%5==0)
			System.out.println(n+" is divisible by 5");
		else
			System.out.println(n+" is not divisible by 5");
	}
}
class Prog14
{
	public static void main(String args[])
	{
		Checker ob=new Checker();
		ob.check(13);
		ob.check(5);
	}
}