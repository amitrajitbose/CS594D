class Circle
{
	int r;
	double pi=3.142;
	void Area(int r)
	{
		System.out.println("Area: "+(pi*r*r));
	}
	void Perimeter(int r)
	{
		System.out.println("Perimeter: "+(2*pi*r));
	}
}
class Prog6
{
	public static void main(String args[]){
	Circle ob4=new Circle();
		System.out.println("Circle");
		ob4.Area(10);
		ob4.Perimeter(10);
	}
}