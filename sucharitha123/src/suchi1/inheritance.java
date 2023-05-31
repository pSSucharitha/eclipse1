package suchi1;
class parent{
	int age=24;
	public void pri() {
		System.out.println("hii i am a super class");
	}
}
public class inheritance extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance re=new inheritance();
		re.pri();
		System.out.println(re.age);
	}

}
