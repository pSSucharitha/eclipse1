package day1;
import java.util.Scanner;	
public class method {
		//method creation
		public int ret() {
			int n1=10;
			int n2=20;
			int sum=n1+n2;
			return sum;
		}
		public int pri() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter num1:");
			int n1=sc.nextInt();
			System.out.println("enter num2:");
			int n2=sc.nextInt();
			int sum=n1+n2;
			return sum;
		}
		//main method
		public static void main(String[] args) {
	method result=new method();
			int sum1 = result.ret();
			System.out.println(sum1);
			int sum=result.pri();
			System.out.println(sum);
		}
	}


