import java.util.Scanner;
import java.util.Arrays;
class Median
{
	void displayMedian(int arr[]){
		double mdn;
		int n=arr.length;
		Arrays.sort(arr); //inbuilt function to sort arrays
		if(n%2==0){
			mdn=arr[(n/2)-1]+arr[(n/2)];
			mdn=mdn/2;
		}
		else{
			mdn=arr[(int)Math.floor(n/2)];
		}
		System.out.println("Median: "+mdn);
	}
}
class Prog17
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Median ob=new Median();
		System.out.print("Enter Size: ");
		int n=sc.nextInt();
		int i;
		int arr[]=new int [n];
		System.out.print("Enter Array: ");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();

		}
		ob.displayMedian(arr);
	}
}