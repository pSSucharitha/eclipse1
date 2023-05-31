package mutthread;
import java.util.Scanner;
public class dependingmulthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("student assignment started");
System.out.println("Enter the chapter to do the assignment");
int a=sc.nextInt();
System.out.println("student completed assignment"+a);
//printing starting
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
//operation
System.out.println("addition operation");
int b=90;
int c=70;
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
int res=a+b;
System.out.println("result is "+res);
System.out.println("addition ended");

	}

}
