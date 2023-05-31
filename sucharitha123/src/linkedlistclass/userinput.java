
package linkedlistclass;
import java.util.Scanner;
import java.util.LinkedList;
public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
LinkedList rt=new LinkedList();
LinkedList rt1=new LinkedList();
System.out.println("enter the value num");
rt.add(sc.nextInt());
System.out.println("enter the value string");
rt.add(sc.next());
System.out.println("enter the value string2");
rt.add(sc.next());
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
System.out.println(rt1);


	}

}
