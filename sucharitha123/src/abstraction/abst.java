package abstraction;
class animal{
		String a="animals";
}
	


abstract class anima1s{
	abstract void sound();
	public void anima() {
		System.out.println("animals");
	}
}
class cat1 extends animals{
	public void sound(){
		System.out.println("i am cat1");
		System.out.println("i make sound as meow meow!!!");
	}
}
	class dog1 extends animals{
		public void sound() {
			System.out.println("i am a dog1");
			System.out.println("i make a sound bow bow");
		}
	}
public class abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cat1 sc=new cat1();
sc.sound();
sc.type();
dog1 se=new dog1();;
se.sound();
se.type();
	}

}
