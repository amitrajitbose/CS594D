import java.util.Scanner;
class Euler
{
	void compute(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int i;
		double e=1;
		long dp[] = new long [n+1];
		dp[0]=1;
		for(i=1;i<=n;i++){
			dp[i]=i*dp[i-1];
		}
		
		for(i=1;i<=n;i++){
			e=e+(1.0/dp[i]); //the 1.0 is very important
		}
		System.out.println("Euler's Number: "+e);
	}
}
class Prog18
{
	public static void main(String args[]){
		Euler ob=new Euler();
		ob.compute();
	}
}

/*
OUTPUT:
Enter n: 50
Euler's Number: 2.7182818284590455

Enter n: 10
Euler's Number: 2.7182818011463845
*/