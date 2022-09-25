package Javawraper;

public class interviewque {

	public static void main(String[] args) {
		String a = "imrahul222/08-20,22%";

           char[]abc=a.toCharArray();
           for(int i=0;i<abc.length;i++)
           {
        	   if(Character.isDigit(abc[i]))
        	   {
        		   System.out.println("is Digit:"+abc[i]);
        	   }
        	   else if(Character.isAlphabetic(abc[i]))
        	   {
        		   System.out.println("is alpha:"+abc[i]);
        		   
        	   }
        	   else
        	   {
        		   System.out.println("special char:"+abc[i]);
        	   }
       
           }}
}
