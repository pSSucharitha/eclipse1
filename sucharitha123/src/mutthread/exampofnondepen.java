package mutthread;
import java.util.Scanner;
class assign extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the assignent number");
		int q=sc.nextInt();
		System.out.println("assignment completed");
	}
}
class print extends Thread{
	public void run() {
		System.out.println("start printing");
		for(int i=0;i<5;i++) {
			System.out.println("sasi");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end printing");
	}
}
class oper extends Thread{
	public void run() {
		System.out.println("multiplication operation");
		int a=987;
		int b=986;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int c=a+b;
		System.out.println("result is "+c);
	}
}


public class exampofnondepen {
public static void main(String[] args) {
	assign k=new assign();
	print l=new print();
	oper m=new oper();
	k.start();
	l.start();
	m.start();
}
}
