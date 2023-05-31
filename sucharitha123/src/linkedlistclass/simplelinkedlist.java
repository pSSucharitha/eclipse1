package linkedlistclass;
import java.util.Scanner;
import java.util.LinkedList;
public class simplelinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
LinkedList rt=new LinkedList();
LinkedList rt1=new LinkedList();
rt.add(2);
rt.add("subbu");
rt.add("friend");
System.out.println(rt);
rt1.addAll(rt);
System.out.println(rt1);
rt.remove("friend");
System.out.println(rt);
rt.clear();
System.out.println(rt);
System.out.println(rt.size());
System.out.println(rt.indexOf(1));
rt1.addFirst("cbit");
System.out.println(rt1);
rt1.addLast("clg");
System.out.println(rt1.offerFirst("subbu"));
System.out.println(rt.pollFirst());
//System.out.println(rt.);
	}

}
