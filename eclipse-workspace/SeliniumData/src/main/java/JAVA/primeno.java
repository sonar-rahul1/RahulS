package JAVA;

public class primeno {
	 public static void main(String args[]){    
	 
		 int n,m=0,flag=0;
		 n=3;
		 m=n/2;
		 if(n==0||n==1)
		 {
			 System.out.println(n+"no is not prime");
		 }
		 else
		 {
			 for(int i=2;i<=m;i++)
			 {
				 if(n%i==0)
				 {
					 System.out.println(n+"no is not prime");
					 flag=1;
					 break;
					 
				 }
			 }
			 if(flag==0)
			 {
				 System.out.println(n+"no is prime");
			 }
		 }
	 } 
}
