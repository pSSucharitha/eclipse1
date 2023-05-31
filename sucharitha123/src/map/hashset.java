package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> g=new HashSet<>();
Set<Integer> h=new HashSet<>();
g.add(90);
g.add(70);
g.add(89);
h.add(90);
h.add(60);
h.add(70);
System.out.println(g);
System.out.println(g.addAll(h));
//g.removeAll(g);
//System.out.println(g);
System.out.println(g.isEmpty());
System.out.println(g.retainAll(h));
System.out.println(g.contains(h));

//iterators
Iterator<Integer> i=g.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
