
package iterator;
//import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
public class iteratorelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> dta=new LinkedList<String>();
dta.add("siva");
dta.add("sasi");
dta.add("harshi");
for(String b:dta) {
	System.out.println(b);
}
	System.out.println(" ");
	//iterator
	//LinkedList<String> dta=new LinkedList<String>();
	Iterator i=dta.iterator();
	while(i.hasNext()) {
		//System.out.println(i.next());
		if(i.next().equals("siva")) {
			i.remove();
		}
	}
			System.out.println(dta);
		
	}
	

}
