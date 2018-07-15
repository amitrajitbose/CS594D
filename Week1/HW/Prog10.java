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
class Prog10
{
	public static void main(String args[])
	{
		Swap obj=new Swap();
		obj.swapit(2,3);
	}
}