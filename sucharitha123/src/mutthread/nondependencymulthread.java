package mutthread;

import java.util.Scanner;


class assignment extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("student assignment started");
		System.out.println("Enter the chapter to do the assignment");
		int a=sc.nextInt();
		System.out.println("student completed assignment"+a);

	}
}
class printing extends Thread{
	public void run() {
		System.out.println("start printing");
		for(int i=0;i<5;i++) {
			System.out.println("cbit");
		try {
			Thread.sleep(500);//(click on the error then surrounded with try/catch
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
System.out.println("printing ended");
	}
}
class operation extends Thread{
	public void run() {
		System.out.println("addition operation");
		int b=90;
		int c=70;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int res=b+c;
		System.out.println("result is "+res);
		System.out.println("addition ended");


	}
}
public class nondependencymulthread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment ass=new assignment();
		printing pri=new printing();
		operation ope=new operation();
		ass.start();
		pri.start();
		ope.start();
		

	}

}
