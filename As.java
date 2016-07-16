
public class As {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1234";
		int j=0;
		int [] a=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
		a[j]=str.charAt(i)-'0';
		j++;
		System.out.printf("%d",a[i]);
		}
	
	}

}
