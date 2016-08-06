import java.util.Scanner;


public class arrayReapeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the arrray");
		int c=in.nextInt();
		int arr[]=new int[c];
		System.out.println("enter the elements in the array");
	
int count=0;
		for(int i=0;i<arr.length;i++)
{
	arr[i]=in.nextInt();
}
ct: for(int i=0;i<arr.length;i++)
 {
	for(int j=1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			count =j;
			break ct;
		}
	}
}
System.out.println("position is "+count);
	}

}
