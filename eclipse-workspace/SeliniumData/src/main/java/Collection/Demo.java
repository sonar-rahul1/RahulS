package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
//		String Original,reverse="";
		int r,temp,n,sum=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter String/no");
				n=sc.nextInt();
		
			//	n=414;
				temp=n;
				while(n>0)
				{
				   r=n%10;
				sum=sum*10+r;
				n=n/10;
				}
				if(temp==sum)
				{
				   System.out.println("no is palindome");
				}
				else
				{
				System.out.println("no is not palindrome");
				}
	}

}
