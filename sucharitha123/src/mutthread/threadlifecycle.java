package mutthread;

public class threadlifecycle extends Thread {
public void run() {
	Thread.currentThread().setName("run_method");
	System.out.println("worker thread is running");
	try {
		Thread.sleep(500);/////simulating some over
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(getName()+": run method is alive check: "+isAlive());
	System.out.println("worker thread is done:");
	try {
		Thread.sleep(5000);//////simulating some work
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}

	public static void main(String[] args){
		// TODO Auto-generated method stub
System.out.println("main thread continues executing.");
Thread.sleep
