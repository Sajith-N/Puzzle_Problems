import java.util.Scanner;


public class sumOfdigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the digits youwant to count");
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int s=0;
for(int i=a;i>0;i--)
{
	for(int j=i;j>0;j--)
	{
		s=s+j;
	}
}
System.out.println(s);
	}

}
