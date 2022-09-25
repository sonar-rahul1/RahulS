package Javawraper;

public class SeprateCharacter {
	public static void main(String []args)
	{
	 String a="I22am@10Rahul#1990";
	 char[] abc=a.toCharArray();
	 for(int i=0;i<=abc.length;i++)
	  { 
	   if(Character.isDigit(abc[i]))
	     {
	       System.out.println("Digit is :"+abc[i]);
	     }
	     else if(Character.isAlphabetic(abc[i]))
	      {
	        System.out.println("Alphabetic is:"+abc[i]);
	      }
	      else
	      {
	         System.out.println("Special char is:"+abc[i]);
	      }
	   }
	}

}
