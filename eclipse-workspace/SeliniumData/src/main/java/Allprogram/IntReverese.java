package Allprogram;

public class IntReverese {

	public static void main(String[] args) {
		int num=12345;
		int m,rev=0;
		while(num!=0)
		{
			m=num%10;
			rev=rev*10+m;
			num=num/10;
		}
		System.out.println("rev is:"+rev);
		}

}
