package day1;

import java.util.Scanner;
import java.util.Arrays;
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		 int a=sc.nextInt();
		//int b=sc.nextInt();
		System.out.println("enter the values in array index");
		int arr[]=new int[a];
		int arr1[]=new int[3];
		//int arr2[]=new int[];
		arr[0]=28;
		arr[1]=38;
		arr[2]=48;
	
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+",");
		}

System.out.println(Arrays.asList(arr));
int key=28;
System.out.println(Arrays.binarySearch(arr, key));
System.out.println(Arrays.binarySearch(arr,1,3,key));
System.out.println(Arrays.toString(arr));
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.equals(arr, arr1));
int arr2[][]= new int[3][3];
//System.out.println(arr2[0][1]);

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

	}

}
