package inheritance;

class father{
	String name="sweety";
}

class son extends father{
	int age=21;
}
class daughter extends father{
	int age1=23;
	
}
public class hierachical{
	public static void main(String[] args) {
		son sc2=new son();
         daughter sc1=new daughter();		
System.out.println(sc2.name);
System.out.println(sc2.age);
System.out.println(sc1.name);
System.out.println(sc1.age1);
		}

}
