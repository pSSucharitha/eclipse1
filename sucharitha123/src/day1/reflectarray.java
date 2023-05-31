package day1;
import java.util.Arrays;
import java.lang.reflect.Array;
public class reflectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=(int[])Array.newInstance(int.class, 5);
System.out.println(Arrays.toString(arr));
Array.setInt(arr, 0, 10);
Array.setInt(arr, 4, 50);
System.out.println(Arrays.toString(arr));
int a=Array.getInt(arr, 4);
System.out.println(a);

	}

}
