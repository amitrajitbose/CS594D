//Grade Calculator

class GradeChecker
{
	char grade;
	void grader(double p)
	{
		if(p>=90.0)
			grade='A';
		else if(p>=80.0)
			grade='B';
		else if(p>=70.0)
			grade='C';
		else if(p>=60.0)
			grade='D';
		else if(p>=40.0)
			grade='E';
		else
			grade='F';
		System.out.println("Percentage="+p+"% ; Grade="+grade);
	}
}
class Prog13
{
	public static void main(String args[])
	{
		GradeChecker ob=new GradeChecker();
		ob.grader(92.8);
		ob.grader(52.3);
		ob.grader(75.5);
		ob.grader(63.25);
		ob.grader(39.25);
	}
}