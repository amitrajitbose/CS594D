/*
Day-1 Lab
Program to swap two numbers without the use of a third variable
*/
class Swap
{
	int a,b;
	void swapit(int a,int b)
	{
		System.out.println("Before Swapping: a="+a+",b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: a="+a+",b="+b);
	}
}
class Swapping
{
	public static void main(String args[])
	{
		Swap obj=new Swap();
		obj.swapit(2,3);
	}
}