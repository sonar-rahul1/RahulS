package Collection;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		
		String Original,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		Original = sc.nextLine();
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