package Collection;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		int n,flag=0,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
		
		int Start=sc.nextInt();
		System.out.println("enter 2nd no");
		int end=sc.nextInt();
		System.out.println("List of prime no between "+Start+""+end);
		
//		m=n/2;
//		if(==0||n==1)
//		{
//		  System.out.println("no is not prime");
//		}
//		else{

		for(int i=Start;i<=end;i++)
		{
		  if(end%i==0)
		 {
		  flag=1;
		  System.out.println("no is not prime");
		break;
		  }
		}
		
		  if(flag==0)
		{
		 System.out.println("no is prime");
		}
		}

	}


