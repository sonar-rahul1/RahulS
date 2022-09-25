package Allprogram;

public class SeprateCharacter {

	public static void main(String[] args) {
		String a="hfsdy23rt65eycss31%^R";
		char[]abc=a.toCharArray();
		for(int i=0;i<abc.length-1;i++)
		{
			if(Character.isAlphabetic(i))
			{
				System.out.println("alphabetic is:"+abc[i]);
			}
			else if(Character.isDigit(i))
			{
				System.out.println("Digit is:"+abc[i]);
			}
			else
			{
				System.out.println("SpecialCharacter is:"+abc[i]);
			}
		}
		
	}

}
