//Miles To KM
class Convert
{
	double km;
	void mileToKm(double m)
	{
		km=m*1.609344;
		System.out.println("Distance in Miles:"+m+"\nDistance is KM:"+km+"\n");
	}
}
class Prog11
{
	public static void main(String args[])
	{
		Convert ob=new Convert();
		ob.mileToKm(10);
		ob.mileToKm(2);
	}
}