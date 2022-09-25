package Javawraper;

public class Revisionwraper {

	 public static void main(String[]args)
	 {
		 String b="jcd8922j";
		 char[]abc =b.toCharArray();
		 for(int i=0;i<=abc.length;i++)
		 {
			 if(Character.isDigit(abc[i]))
			 {
				 System.out.println("digit is:"+abc[i]);
				 
			 }
			 else if(Character.isAlphabetic(abc[i]))
			 {
				 System.out.println("Alphabetic is :"+abc[i]);
			 }
			 else
			 {
				 System.out.println("Specialo char is:"+abc[i]);
			 }
		 }
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
}
