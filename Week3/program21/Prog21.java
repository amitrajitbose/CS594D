//find duplicate elements in a 1D array and find their frequency of occurrence
import java.util.Scanner;
class Duplicate
{
	int n,a[];

	void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }

	void takeInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Size ");
		n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter Values Below:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sort(a);
	}

	void find(){
		int f;
		int curr=-999999;
		for(int i=0;i<n-1;i++){
			f=1;
			if(a[i]!=curr){
				curr=a[i];
				for(int j=i+1;j<n;j++){
					if(a[j]==curr){
						f++;
					}
				}
				if(f>1){
					System.out.println("Occurrence of "+curr+" is: "+f);
				}
			}
		}
	}
}
class Prog21
{
	public static void main(String args[])
	{
		Duplicate ob=new Duplicate();
		ob.takeInput();
		ob.find();
	}
}