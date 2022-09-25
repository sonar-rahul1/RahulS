package Allprogram;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		int m,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the no");
		     int n=sc.nextInt();

		m=n/2;
		if(n==0||n==1)
		{
		 System.out.println("is not prime");
		}
		else {
		    for(int i=2;i<m;i++)
		     {
		       if(n%i==0)
		       {
		          flag=1;
		         System.out.println("is not prime");
		          break;
		       }
		    }
		if(flag==0)
		   { 
		     System.out.println("is prime");
		   }
		}
		 
		     
		  
	}

}
