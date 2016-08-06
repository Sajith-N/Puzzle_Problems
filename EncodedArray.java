
public class EncodedArray {
	public static void main(String[] args) {
	System.out.println("let this be encoded array");
		int []earr={-44,-37,31,23,0,-6,83,110,74,53
				};
	int len=earr.length;
		int []oarr=new int[earr.length];
	
	oarr[len-1]=earr[len-1];
	for(int i=len-2;i>=0;i--)
	{
		oarr[i]=earr[i]-oarr[i+1];
	}
	System.out.println("orginal array");
int result=0;
	for(int i=0;i<len;i++)
{result=result+oarr[i];
	System.out.println("element at"+i+"position is:"+oarr[i]);
}
System.out.println("first number in the orginal array "+oarr[0]);
System.out.println("the sum of the elements in the array"+result);
}
}
