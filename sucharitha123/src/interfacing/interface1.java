package interfacing;
interface car{
	void price();
	void color();
}
interface bike{
	void cprice();
	void ccolor();
}
abstract class details implements car,bike{

	/*@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("car price is 1000000");
		
	}*/

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("car color is red");
		
	}

	@Override
	public void cprice() {
		// TODO Auto-generated method stub
		System.out.println("bike price is 90000");
	}

	@Override
	public void ccolor() {
		// TODO Auto-generated method stub
		System.out.println("bike color is black");
	}
	
}
class dea extends details{
	public void price() {
		System.out.println("car price is1000000");
	}
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*car cr=new details();
bike cp=new details();
cr.color();
cr.price();
System.out.println();
cp.ccolor();
cp.cprice();*/
		dea d=new dea();
		d.color();
		d.price();
		d.cprice();
		d.ccolor();
	}

}
