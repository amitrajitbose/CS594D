class Convert
{
	double c,f;
	void convertToFahrenheit(double c){
		f=((9*c)/5)+32;
		System.out.println("celsius temperature="+c+"\nfahrenheit temperature="+f);
	}
}
class Prog3
{
	public static void main(String args[]){
		Convert obj=new Convert();
		obj.convertToFahrenheit(28);
	}
}