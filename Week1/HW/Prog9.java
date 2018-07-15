//Max of 3 numbers

class Max
{
	int max;
	void findMax(int num1,int num2,int num3)
	{
		if(num1 > num2)
		{
			if(num1 > num3)
			{
			    /* If num1 > num2 and num1 > num3 */
			    max = num1;
			}
			else
			{
			    /* If num1 > num2 but num1 > num3 is not true */
			    max = num3;
			}
		}
		else
		{
			if(num2 > num3)
			{
			    /* If num1 is not > num2 and num2 > num3 */
			    max = num2;
			}
			else
			{
			    /* If num1 is not > num2 and num2 > num3 */
			    max = num3;
			}
		}
		System.out.println("Maximum: "+max);
	}
}
class Prog9
{
	public static void main(String args[])
	{
		Max ob=new Max();
		ob.findMax(10,20,18);
	}
}