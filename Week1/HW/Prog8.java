//Positive or Negative
class Checker
{
	int n;
	void check(int n)
	{
		if(n>0)
			System.out.println(n+" is Positive Number");
		else if(n<0)
			System.out.println(n+" is Negative Number");
		else
			System.out.println("Zero is neither Positive nor Negative");
	}
}
class Prog8
{
	public static void main(String args[])
	{
		Checker ob=new Checker();
		ob.check(10);
		ob.check(-5);
		ob.check(0);
	}
}