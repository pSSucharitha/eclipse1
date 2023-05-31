package abstraction;
abstract class animals{
	abstract void sound();
	public void type() {
		System.out.println("veg and non-veg");
	}
}
class cat extends animals{
	public void sound() {
		System.out.println("meow meow!!!");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cat c=new cat();
c.sound();
c.type();
	}

}
