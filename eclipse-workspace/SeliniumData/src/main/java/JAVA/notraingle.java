package JAVA;

public class notraingle {

	public static void main(String[] args) {
		int n=5,sum;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				sum=i+j;
				if(sum%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
				System.out.println();
			}
		}
		
}
