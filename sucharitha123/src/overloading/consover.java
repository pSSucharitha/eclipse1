package overloading;

public class consover {
private int age;
private String name;
private String surname;

public consover(int age,String name) {
this.age=age;
this.name=name;

}
public consover(int age,String name,String surname) {
	this.age=age;
    this.name=name;
    this.surname=surname;
}

public int getage() {
	return age;
}
public String getname() {
	return name;
}
public String surname() {
	return surname;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
consover co=new consover(67,"sweety");
System.out.println("my age is "+co.age);
System.out.println("my name is "+co.name);
consover cc=new consover(67,"sweety","pasa");
System.out.println("my age is "+cc.age);
System.out.println("my name is "+cc.name);
System.out.println("my surname is "+cc.surname);

	}

}
