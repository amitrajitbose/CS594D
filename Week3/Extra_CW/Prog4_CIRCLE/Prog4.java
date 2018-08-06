class Circle
{
	private double radius;
	private String color;
Circle()
{
	radius=1.0;	
	color="red";
}
Circle(double newr)
{
	radius=newr;
}
public double getRadius()
{
return radius;
}
public double getArea()
{
return (3.142*radius*radius);
}
}

class Prog4
{
public static void main(String args[])
{
Circle ob1= new Circle();
Circle ob2= new Circle(5.0);
System.out.println("RADIUS: "+ob1.getRadius()+"\nAREA: "+ob1.getArea());
System.out.println("RADIUS: "+ob2.getRadius()+"\nAREA: "+ob2.getArea());
}
}