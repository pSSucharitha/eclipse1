package Mapstypes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class generichashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m=new HashMap();////incase of hashmap we can give treemap r linkedhashmap
	////adding elements to map
	m.put(1,"amit");
	m.put(5,"rahul");
	m.put(2,"jai");
	m.put(1, "amit");
	///traversing Map
	Set s=m.entrySet();///converting to set so that we can traverse
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		/////converting to Map.Entry so that we can get key and value seperately
		Map.Entry ent=(Map.Entry)itr.next();
		System.out.println(ent.getKey()+" "+ent.getValue());
	}


	}

}
