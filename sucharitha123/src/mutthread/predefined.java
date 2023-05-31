package mutthread;

public class predefined extends Thread {
public void run(){
	System.out.println("run method"+Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().getName());
	System.out.println();
	Thread.currentThread().setName("run");
	System.out.println(Thread.currentThread().getName());
	System.out.println();
	Thread.currentThread().setPriority(7);
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		predefined c=new predefined();
		c.start();
		Thread.currentThread().setName("suchi");
		
//System.out.println("main method"+Thread.currentThread().getPriority());
System.out.println();
	}
}