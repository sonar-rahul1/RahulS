package tutorial;

public class reverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=12345;
		int m,rev=0;
		
		while(num !=0)
		{
			
			m=num%10;
			rev=rev*10+m;
			num=num/10;
		}
		System.out.println("rev num:"+rev);
		
	}

}
