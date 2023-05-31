package abstraction;
class teacher{
	int a=90;
	public void teach() {
		System.out.println("i am a teacher");
	}
}
class mathTeach extends teacher{
	public void teach() {
		super.teach();
		System.out.println("i am maths teacher");
	}
}
public class methodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat no=new cat();
		no.sound();
mathTeach mt=new mathTeach();
mt.teach();
System.out.println(mt.a);
	}

}
