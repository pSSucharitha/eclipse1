package inheritance;
class parent{
	int age=55;
public  void pri() {
	System.out.println("String name:");
	
}
}
 class subchild extends parent{
String name="suchi";

}
public class class1 extends subchild{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
class1 re=new class1();
System.out.println("my name "+re.name+" my age is "+re.age);
}
}

