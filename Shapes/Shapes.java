/*
Day-1 Lab
Program to implement OOP concept to calculate area and perimeter of various shapes
*/
class Square
{
	int a;
	void Area(int a)
	{
		System.out.println("Area: "+(a*a));
	}
	void Perimeter(int a)
	{
		System.out.println("Perimeter: "+(4*a));
	}
}

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
class Triangle
{
	int a,b,c;
	//Heron's formula
	void Area(int a,int b,int c)
	{
		double s=(a+b+c)/2;
		double ar=Math.sqrt((s)*(s-a)*(s-b)*(s-c));
		System.out.println("Area: "+(ar));
	}
	void Perimeter(int a,int b,int c)
	{
		System.out.println("Perimeter: "+(a+b+c));
	}
}
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
class Shapes
{
	public static void main(String args[]){
		Square ob1=new Square();
		System.out.println("Square");
		ob1.Area(5);
		ob1.Perimeter(5);

		Rectangle ob2=new Rectangle();
		System.out.println("Rectangle");
		ob2.Area(5,6);
		ob2.Perimeter(5,6);

		Triangle ob3=new Triangle();
		System.out.println("Triangle");
		ob3.Area(1,2,3);
		ob3.Perimeter(1,2,3);

		Circle ob4=new Circle();
		System.out.println("Circle");
		ob4.Area(10);
		ob4.Perimeter(10);
	}
}