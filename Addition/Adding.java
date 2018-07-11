/*Day 1 Lab
**Program to add two numbers and implement OOP
*/
class Add
{
	int a=2,b=3,c;
	void sum()
	{
		//the brackets () indicate that sum is a method
		//the concept of functions is replaced by methods in Java
		c=a+b;
		//a,b,c are class variables and are already defined
		System.out.println("The Sum Is: "+c);
	}
}
class Adding
{
	public static void main(String args[])
	{
		//since we are using the static keyword thus we do not explicitly require to create object to call it
		Add obj=new Add();
		System.out.println("A="+obj.a);
		System.out.println("B="+obj.b);
		System.out.println("C="+obj.c);
		//N.B: here C prints zero, because there is no concept of initial garbage value. Initialised happens with zero by default
		obj.sum(); 
	}
}