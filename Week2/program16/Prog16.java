import java.util.Scanner;
class BinDecConversion
{
	int binary(int n){
		String bin="";
		while(n>0){
			int r=n%2;
			n=n/2;
			char c=(char)(r+'0');
			bin=c+bin;
		}
		int b=Integer.parseInt(bin);
		return b;
	}
	int decimal(int n){
		int i=0;
		int dec=0;
		while(n>0){
			int d=n%10;
			dec=dec+(d*(int)Math.pow(2,i));
			n=n/10;
			i++;
		}
		return dec;
	}
}
class Prog16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BinDecConversion obj=new BinDecConversion();
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		System.out.print("Enter 'B' for binary 'D' for decimal: ");
		char opt=sc.next().charAt(0);
		if(opt=='B'){
			System.out.println("Binary Equivalent: "+obj.binary(n));
		}
		else if(opt=='D'){
			System.out.println("Decimal Equivalent: "+obj.decimal(n));
		}
	}
}