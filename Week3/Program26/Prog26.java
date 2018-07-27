class ConsOver
{  
	int a;
	double b;//instance variables
	ConsOver()//0-arguments constructor
	{
		a=0;
		b=0.0;
	} 
	ConsOver(int x,double y)//Parameterized Constructor
	{
		a=x;
		b=y;
	}
	void print()
	{ 
	System.out.println("a= "+a+" b= "+b);
	}
}
class Prog26
{
	public static void main(String args[])
	{
		ConsOver ob1=new ConsOver();
		ConsOver ob2=new ConsOver(2,2.5);
		ob1.print();  
		ob2.print(); 

	}  
}  