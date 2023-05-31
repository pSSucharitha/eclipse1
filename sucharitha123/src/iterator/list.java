package iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> n=new LinkedList<String>();
LinkedList m=new LinkedList();
m.add("shoba");
m.add("ramesh");
m.add("siva");
System.out.println(m);
System.out.println("list iterator");

ListIterator p=m.listIterator();
System.out.println(".....");
while(p.hasNext()) {
	System.out.println(p.next());
}
System.out.println();
System.out.println(p.hasPrevious());
System.out.println("reverse order");
while(p.hasPrevious()) {
	System.out.println(p.previous());
	
}
	}

}
