/*
Day-1 Lab
Program to inter convert celsius and fahrenheit scales of temperature
*/
class Convert
{
	double c,f;
	void convertToCelsius(double f){
		c=(5*(f-32))/9;
		System.out.println("fahrenheit temperature="+f+"\ncelsius temperature="+c);
	}
	void convertToFahrenheit(double c){
		f=((9*c)/5)+32;
		System.out.println("celsius temperature="+c+"\nfahrenheit temperature="+f);
	}
}
class ScaleConvert
{
	public static void main(String args[]){
		Convert obj=new Convert();
		obj.convertToFahrenheit(28);
		obj.convertToCelsius(82.4);
	}
}