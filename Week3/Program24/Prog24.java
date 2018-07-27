class Prog
{  
	int a;
	double b;//instance variables
	Prog()//0-arguments constructor
	{
		a=0;
		b=0.0;
	} 
	void print()
	{ 
	System.out.print("a= "+a+" b= "+b);
	}
}
class Prog24
{
	public static void main(String args[])
	{
		Prog ob=new Prog();//Constructor is invoked.
		ob.print();  

	}  
}  