import java.util.Scanner;
public class jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
arr[0]=new int[a];
arr[1]=new int[b];
arr[2]=new int[c];
/*arr[0][0]=6;
arr[0][1]=7;
arr[1][0]=8;
arr[1][1]=9;
arr[1][2]=2;
arr[1][3]=3;
arr[2][0]=4;*/
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.println("enter the value of index ["+i+"] ["+j+"] ");
		arr[i][j]=sc.nextInt();
	}
}

for(int i=0;i<arr.length;i++) {	
for(int j=0;j<arr[i].length;j++) {
	System.out.print(arr[i][j]+" ");
}System.out.println();
}	}

}
