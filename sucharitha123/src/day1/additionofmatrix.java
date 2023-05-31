package day1;
import java.util.Scanner;
public class additionofmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the array length");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("enter the values in array index");
int arr2[][]=new int[3][3];
for(int i=0;i<arr2.length;i++)
{
	for(int j=0;j<arr2[i].length;j++)
	{
		System.out.println("enter the value of index ["+i+"] ["+j+"] ");
		arr2[i][j]=sc.nextInt();
	}
}
for(int i=0;i<arr2.length;i++)
{
	for(int j=0;j<arr2.length;j++)
	{
		System.out.print(arr2[i][j]+",");
	}
	System.out.println();
}

int arr3[][]=new int[3][3];
for(int i=0;i<arr3.length;i++)
{
	for(int j=0;j<arr3[i].length;j++)
	{
		System.out.println("enter the value of index ["+i+"] ["+j+"] ");
		arr3[i][j]=sc.nextInt();
	}
}
for(int i=0;i<arr3.length;i++)
{
	for(int j=0;j<arr3.length;j++)
	{
		System.out.print(arr3[i][j]+",");
	}
	System.out.println();
}
int arr4[][]=new int[4][4];
for(int i=0;i<arr4.length;i++)
{
	for(int j=0;j<arr4[i].length;j++)
	{
		if(i==j) {
		arr4[i][j]=arr2[i][j] + arr3[i][j];
		System.out.println(arr4[i][j]+" ");
	}
		//else {
			
		//4}
		}
	}System.out.println();
}



	}

}
