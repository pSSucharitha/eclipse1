package inheritance;
class teacher{
	String nam="teaching";
	
}

class teachers {
	String teach="attendance";
}
class maths extends teacher{
	public void teach() {
	//String name="i am teaching mathematics";
	//String Name1="i am taking attendance";
	super.teach();
}
}
class science extends teacher{
	public void teach() {
	//String Name2="i am teaching science";
	//String Name3="i am taking attendance";
}
}
public class teacher1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
maths sc=new maths();
science sc1=new science();
/*System.out.println(sc.name);
System.out.println(sc.Name1);
System.out.println(sc1.Name2);
System.out.println(sc1.Name3);*/
sc.teach();




	}

}
