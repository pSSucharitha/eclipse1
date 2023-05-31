
//////stack(LIFO)
package stacks;
import java.util.Stack;
public class stackkkk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack st=new Stack();
st.push(100);
st.push(20);
st.push(30);
st.push(40);
st.push(50);
System.out.println(st);

st.pop();

System.out.println(st);
System.out.println(st.empty());
System.out.println(st.capacity());
System.out.println(st.peek());
System.out.println(st.contains(50));
System.out.println(st.search(40));
System.out.println(st.elementAt(0));
//System.out.println(st.wait());
	}

}
