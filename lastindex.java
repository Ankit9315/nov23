package nov22;
import java.util.Scanner;
public class lastindex {
	public static void indexn(int arr[],int n)
	{
		int a=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
			a=i;
			}
		}
		System.out.println("Last Index of "+n+" = "+a);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
    
	  System.out.println("Enter the element whose index is to be found :");
	  a=sc.nextInt();
	  indexn(arr,a);
}
}
