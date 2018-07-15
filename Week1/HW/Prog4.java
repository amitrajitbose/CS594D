class Convert
{
	double c,f;
	void convertToCelsius(double f){
		c=(5*(f-32))/9;
		System.out.println("fahrenheit temperature="+f+"\ncelsius temperature="+c);
	}
}
class Prog4
{
	public static void main(String args[]){
		Convert obj=new Convert();
		obj.convertToCelsius(82.4);
	}
}