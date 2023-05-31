package queueimplementation;
import java.util.HashSet;
import java.util.Set;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> ss=new HashSet<Integer>();
////
ss.add(2);
ss.add(6);
ss.add(4);
ss.add(1);
System.out.println(ss);

Set<String> h=new HashSet<String>();
h.add("ab");
h.add("bc");
h.add("cd");
h.add("e");
System.out.println(h);


Set<Integer> g=new HashSet<Integer>();
g.add(9);
g.add(6);
g.add(7);
System.out.println(g);
System.out.println(g.hashCode());
	}

}
