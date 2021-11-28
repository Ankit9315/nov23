package nov22;
import java.util.Scanner;
public class binarytodecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		int a=sc.nextInt();
		int sum=0,b=0;
		while(a!=0)
	       {
	    	  sum+=(a%10)*Math.pow(2, b);
	    	  a=a/10;
	    	  b++;
	       }
	       System.out.println("Decimal Equivalent : "+sum);
		
	}
}
