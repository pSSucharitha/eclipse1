package encapsulation;
class cbit{
	 private String name="cbit";
	private int age=20;
    public String getName() {
    	return name;
    }
    public int getage() {
    	return age;
    }
}

	

public class encaps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
cbit sv=new cbit();
System.out.println(sv.getName());
System.out.println(sv.getage());
	}

}
