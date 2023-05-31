package dodo;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayalllist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

//System.out.print("Original ArrayList:");
ArrayList dt=new ArrayList();
dt.add(sc.next());
dt.add(sc.next());
System.out.print(dt);
ArrayList dr=new ArrayList();
ArrayList ds=new ArrayList();
dt.add(sc.next());
dt.add(sc.next());
dt.addAll(dr);
System.out.println(dr);
	}

}
