package nov22;
import java.util.Scanner;
public class differencearray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int sum[] = new int[n];
		System.out.println("Enter elements of 1st array :");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of 2nd array :");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("difference of two array elements :");
		for(int i=0;i<n;i++)
		{
			sum[i]=arr1[i]-arr2[i];
			System.out.println(sum[i]);
		}
	}
}
