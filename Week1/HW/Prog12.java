class Checker
{
	void checkLeap(int year)
	{
		if(year%4 == 0)
	    {
	        if( year%100 == 0)
	        {
	            // year is divisible by 400, hence the year is a leap year
	            if ( year%400 == 0)
	                System.out.println(year+" is a leap year.");
	            else
	                System.out.println(year+" is NOT a leap year.");
	        }
	        else
	            System.out.println(year+" is a leap year.");
	    }
    else
        System.out.println(year+" is NOT a leap year.");
	}
}
class Prog12
{
	public static void main(String args[])
	{
		Checker ob=new Checker();
		ob.checkLeap(2012);
		ob.checkLeap(2018);
		ob.checkLeap(1900);
		ob.checkLeap(1004);
	}
}