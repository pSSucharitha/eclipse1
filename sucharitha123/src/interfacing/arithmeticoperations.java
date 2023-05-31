package interfacing;


interface number{
	void sum();
	void difference();
	void mul();
	void division();
}
 class operate  implements number{
int a=8;
int b=10;
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int sum=a+b;
		System.out.println(sum);
	}

	@Override
	public void difference() {
		// TODO Auto-generated method stub
		int difference=a-b;
		System.out.println(difference);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int mul=a*b;
		System.out.println(mul);
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		int division=a/b;
		System.out.println(division);
	}
	
}
public class arithmeticoperations {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number ol=new operate();
		ol.sum();
		ol.difference();
		ol.mul();
		ol.division();
	}

}
