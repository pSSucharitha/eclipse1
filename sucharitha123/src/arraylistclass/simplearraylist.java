package arraylistclass;
import java.util.ArrayList;
public class simplearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList std=new ArrayList();
ArrayList ctd=new ArrayList();
ArrayList std2=new ArrayList();
ArrayList ctd2=new ArrayList();
//ArrayList std3=new ArrayList();
std.add(1);
std.add("suchi");
std.add("cbit");
System.out.println(std);
ctd.addAll(std);
System.out.println(ctd);
std2.clear();
System.out.println(std2);
System.out.println(std.contains("suchi"));
std.remove(1);
System.out.println(std);
System.out.println(std.size());
std.set(1,"sasi");
System.out.println(std);
System.out.println(std.get(1));
System.out.println(std.indexOf(1));
System.out.println(std.clone());
System.out.println(std.equals(std));
System.out.println(std.contains(std2));
System.out.println(std.retainAll(std));
//System.out.println(std.hashCode("hello"));
//System.out.println(std.);
	}

}
