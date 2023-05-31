package queueimplementation;

import java.util.PriorityQueue;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> k=new PriorityQueue<Integer>();
k.add(800);
k.add(810);
k.add(900);
k.add(700);
System.out.println(k);
k.poll();
k.poll();
k.poll();
k.poll();


//System.out.println(k.poll());
while(!(k.isEmpty())){
	System.out.println(k.poll());
	
}
System.out.println(k);
	}

}
