package mutthread;

public class mt extends Thread {
public void run() {
///System.out.println("run method");
	for(int i=0;i<5;i++) {
		System.out.println(i+"run");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
mt b=new mt();
//b.run();
b.start();////internally invoke
//System.out.println("run method");///if we use this before object then run method will execute first
for(int i=0;i<5;i++) {
	System.out.println(i+"main");
}
	}

}
