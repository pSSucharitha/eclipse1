package day1;
import java.util.Scanner;
public class withparareturn {
public int add(int a,int b) {
	int sum=a+b;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
withparareturn sum=new withparareturn();
System.out.println("enter the value of a:");
int a=sc.nextInt();
System.out.println("enter the value of b:");
int b=sc.nextInt();
int res=sum.add(a, b);
System.out.println(res);
	}

}
