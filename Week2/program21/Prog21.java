//Primes in an interval
import java.util.Scanner;
class Sieve
{
    void prime(int m, int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        // Print all prime numbers between m and n
        for(int i = m; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
}
class Prog21{
	public static void main(String args[]){
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Start and End Points: ");
		m=sc.nextInt();
		n=sc.nextInt();
		Sieve ob=new Sieve();
		ob.prime(m,n);
	}
}
/*
$ java Prog21
Enter Start and End Points: 1 100
1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

$ java Prog21
Enter Start and End Points: 100 200
101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199
*/