package JAVA;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		String Original,reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no");
		Original =in.nextLine();
		int length=Original.length();
				for(int i=length-1;i>=0;i--)
				{
					reverse=reverse+Original.charAt(i);
				}
		if(Original.equals(reverse))
		{
			System.out.println("enter no is palindrome");
		}
		else {
			System.out.println("enter no is not palindrome");
		}
	}
}
	
		
      