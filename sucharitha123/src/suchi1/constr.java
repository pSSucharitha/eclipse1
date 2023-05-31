package suchi1;
import java.util.Scanner;
public class constr {
	private int age;
	private String name;
	private int salary;
	private String Address;
	//const
	public constr(int a,String b,int c,String d) {
		age=a;
		name=b;
		salary=c;
		Address=d;
	}
	
//another method for getting data
	public int getAge() {
		return age;
	}
	public String name() {
		return name;
	}
	public int salary() {
		return salary;
	}
	public String Address() {
		return Address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the age:");
		System.out.println("enter the name:");
		System.out.println("enter the salary");
		System.out.println("enter the address:");
		const con=new constr(21,"b",1100,"vidhya nagar");
//int a=con.getAge();
System.out.println(a);
System.out.println(con.age);
//String b=con.name();
System.out.println(b);
System.out.println(con.name);
//int sal=con.salary();
System.out.println(sal);
System.out.println(con.sal);
//String add=sc.nextLine();
System.out.println(con.add);
	}

}
