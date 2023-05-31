package staticvariable;

public class staticvar {
String name;
int rollno;
 String clgname="cbit";
 
 staticvar(int rollno,String name,String clgname){
	 this.name=name;
	 this.rollno=rollno;
	 this.clgname=clgname;
 }
 //method
 public void display() {
	 System.out.println("my name is "+name);
	System.out.println("my rollno is "+rollno);
	System.out.println("my clgname is "+clgname);
	 }
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
staticvar op=new staticvar(10,"suchi","cbit");
staticvar op1=new staticvar(13,"subbu","cbit");
op.display();
op1.display();
	}

}
