class Add
{
	int a=2,b=3,c;
	void sum()
	{
		c=a+b;
		System.out.println("The Sum Is: "+c);
	}
}
class Prog2
{
	public static void main(String args[])
	{
		Add obj=new Add();
		System.out.println("A="+obj.a);
		System.out.println("B="+obj.b);
		System.out.println("C="+obj.c);
		obj.sum(); 
	}
}