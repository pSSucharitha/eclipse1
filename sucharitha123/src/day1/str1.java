package day1;
import java.util.Scanner;
public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//length
String str="Hello  world";
int num=str.length();
System.out.println(str);
System.out.println(num);
//replace
String replace=str.replace("l", "h");
System.out.println(replace);
//IndexOf
String str1="hii";
int Index=str1.indexOf("h");
System.out.println(Index);
//lowerCase
String lower=str.toLowerCase();
System.out.println(lower);
//upperCase
String upper=str.toUpperCase();
System.out.println(upper);
//substring
String subs=str.substring(4);
System.out.println(subs);
//chat At Method
char ch=str.charAt(3);
System.out.println(ch);
if(str.equals(str1)) {
	System.out.println("strings are same");
}
else {
	System.out.println("strings are not same");
}
	}

}
