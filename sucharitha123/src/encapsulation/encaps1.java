package encapsulation;
import java.util.Scanner;
class person{
	/*private String name;
	private int age;
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}

	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
}
public class encaps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
person sp=new person();
System.out.print("enter your name");
String n=sc.next();
System.out.print("enter your age");
int a=sc.nextInt();
sp.setname(n);
sp.setage(a);
System.out.println("my name is "+sp.getname());
System.out.println("my age is"+sp.getage());
	}*/
private String name;
private int age;
public void setname(String name,int age) {
	this.name=name;
	this.age=age;
}
public String getname(String name) {
	return name;
	
}
public int getage(int age) {
	return age;
}
}

public class encaps1{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		person rs=new person();
		System.out.print("enter your name");
		String b=sc.next();
		System.out.print("enter your age");
		int c=sc.nextInt();
		rs.getname(b);
		rs.getage(c);
		System.out.println("my name is "+rs.getname(b)+" my age is "+rs.getage(c));
		
		
	}
}


