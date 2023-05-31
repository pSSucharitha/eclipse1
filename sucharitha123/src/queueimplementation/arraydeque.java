package queueimplementation;
import java.util.ArrayDeque;
import java.util.Iterator;
public class arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
////add(add the elements)
arr.add(10);
arr.add(20);
System.out.println(arr);
arr.addFirst(100);
System.out.println(arr);
arr.addLast(60);
System.out.println(arr);
//offer(same as add)
arr.offerFirst(40);
System.out.println(arr);
arr.offerLast(50);
System.out.println(arr);

//iterators

Iterator it=arr.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}

	}

}
