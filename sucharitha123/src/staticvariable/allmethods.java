
package staticvariable;

public class allmethods {
String name;
int rollno;
 String clgname="cbit";
 
 allmethods(int rollno,String name,String clgname){
	 this.name=name;
	 this.rollno=rollno;
	 this.clgname=clgname;
 }
 allmethods(int rollno,String name){
	 this.name=name;
	 this.rollno=rollno;
	 this.clgname=clgname;
 }
 //static method
 public static void change() {
	 clgname="srit";
 }
 
 public static void main(String[] args) {
		System.out.println("hii i am main method");
	}
	static {
		System.out.println("hii i am static method");
	}

}