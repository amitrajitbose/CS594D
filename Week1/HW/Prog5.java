class Rectangle
{
	int a,b;
	void Area(int a,int b)
	{
		System.out.println("Area: "+(a*b));
	}
	void Perimeter(int a,int b)
	{
		System.out.println("Perimeter: "+(2*(a+b)));
	}
}
class Prog5
{
	public static void main(String args[]){
		Rectangle ob2=new Rectangle();
		System.out.println("Rectangle");
		ob2.Area(5,6);
		ob2.Perimeter(5,6);
	}
}