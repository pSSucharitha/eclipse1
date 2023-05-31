package overloading;

public class method {
public void over(String d) {
	System.out.println(d);
}
public void over(int a) {
	System.out.println(a);
}
public void over(int b,String c) {
	System.out.println("name is "+c+" age "+b);
}
public void over(String e,int f) {
	System.out.println("name is "+e+" age "+f);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method so=new method();
		so.over("cbit",8);

	}

}
