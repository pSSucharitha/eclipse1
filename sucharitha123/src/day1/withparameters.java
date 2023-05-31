package day1;
import java.util.Scanner;
public class withparameters {
	public void pri(String nam,int num) {
		System.out.println(nam+" is "+num+" old");
	}
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    withparameters scc=new withparameters();
    scc.pri("cbit",20);
    System.out.println("enter the value of num1:");
    int a=sc.nextInt();
    System.out.println("enter the value of num2:");
    int b=sc.nextInt();
    scc.sum(a,b);
	}

}
