//Demonstrate parameterized constructor

class Sum
{  
	int a,b; //instance variables
	Sum()//0-arguments constructor
	{
		a=0;
		b=0;
	} 
	Sum(int x,int y)//Parameterized Constructor
	{
		a=x;
		b=y;
	}
	void print()
	{ 
	System.out.println("SUM="+(a+b));
	}
}
class Prog25
{
	public static void main(String args[])
	{
		Sum ob1=new Sum();
		Sum ob2=new Sum(2,3);
		ob1.print();  
		ob2.print(); 

	}  
}  