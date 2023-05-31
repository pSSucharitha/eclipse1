package staticvariable;

public class staticmethod {
	String name;
	int rollno;
	static String clgname="cbit";
	 
	 staticmethod(int rollno,String name){
		 this.name=name;
		 this.rollno=rollno;
		 //this.clgname=clgname;
	 }
	 //static method
	 public static void change() {
		 clgname="srit";
	 }
	 
	 
	 
	 //method
	 public void display() {
		 System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my clgname is "+clgname);
		 }
		 
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	staticmethod op=new staticmethod(10,"suchi");
	staticmethod op1=new staticmethod(13,"subbu");
	op.display();
	System.out.println();
	change();
	op1.display();
		}

}
