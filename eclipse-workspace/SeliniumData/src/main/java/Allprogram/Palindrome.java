package Allprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String Original,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no/String");
		Original=sc.nextLine();
		int length=Original.length();
		for(int i=length-1;i>=0;i--)
		{
		  rev=rev+Original.charAt(i);
		}
		if(Original.equals(rev))
		{
		 System.out.println("is palindrome");
		}
		else{
		System.out.println("is not palindrome");
		}
	}

}
