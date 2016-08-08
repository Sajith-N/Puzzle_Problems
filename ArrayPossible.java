import java.util.Scanner;


public class ArrayPossible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("enter the size of an array");
int size=in.nextInt();
System.out.println("enter the elements in the array");
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=in.nextInt();
}
if(size%2==0)
{
	int sum=0;
	for(int i=0;i<size/2;i++)
	{
		sum+=arr[i];
	}
	int sum1=0;
	for(int j=size/2;j<size;j++)
	{
		sum1+=arr[j];
	}
	int k=size/2;
	if((sum1/k)==(sum/k))
	{
		System.out.println("possible");
		for(int i=0;i<size/2;i++)
		{
			System.out.println("Ist array"+i+"is ="+arr[i]);
		}
		System.out.println("===================");
		for(int j=size/2;j<size;j++)
		{
			System.out.println("II array"+j+"is ="+arr[j]);
		}
	}
	else
	{
		System.out.println("not possible");
		for(int i=0;i<size/2;i++)
		{
			System.out.println("Ist array"+i+"is ="+arr[i]);
		}
		System.out.println("===================");
		for(int j=size/2;j<size;j++)
		{
			System.out.println("II array"+j+"is ="+arr[j]);
		}

	}
}
else
{
	int sum=0;
	for(int i=0;i<=size/2;i++)
	{
		sum+=arr[i];
	}
	int sum1=0;
	for(int j=(size/2)+1;j<size;j++)
	{
		sum1+=arr[j];
	}
	int k=size/2;
	if((sum1/k)==(sum/k))
	{
		System.out.println("possible");
		for(int i=0;i<=size/2;i++)
		{
			System.out.println("Ist array"+i+"is ="+arr[i]);
		}
		System.out.println("===================");
		for(int j=(size/2)+1;j<size;j++)
		{
			System.out.println("II array"+j+"is ="+arr[j]);
		}
	}
	else
	{
		System.out.println("not possible");
		for(int i=0;i<=size/2;i++)
		{
			System.out.println("Ist array"+i+"is ="+arr[i]);
		}
		System.out.println("===================");
		for(int j=(size/2)+1;j<size;j++)
		{
			System.out.println("II array"+j+"is ="+arr[j]);
		}

	}
	
}
	}

}
