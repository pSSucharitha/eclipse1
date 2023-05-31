package day1;
import java.util.Scanner;
public class day4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0) {
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		if(n==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	}
}
