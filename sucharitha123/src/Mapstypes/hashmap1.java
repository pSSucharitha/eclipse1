package Mapstypes;
import java.util.*;
public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map m=new HashMap();
////adding elements to map
m.put(1,"amit");
m.put(5,"rahul");
m.put(2,"jai");
m.put(7, "amit");
///traversing Map
Set s=m.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext()) {
	Map.Entry ent=(Map.Entry)itr.next();
	System.out.println(ent.getKey()+" "+ent.getValue());
}

	}

}
