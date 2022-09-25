package JAVA;

import java.util.ArrayList;

public class demo1 {
	public static void main(String []args)
	   {
	     String a="Selenium";
	     char[]abc=a.toCharArray();
	     ArrayList arr =new ArrayList();
	     for(Object O:abc)
	      {
	           arr.add(O);
	       }
	     System.out.println();
	       for(int i=arr.size()-1;i>=0;i--)
	       {
	         System.out.println(arr.get(i));
	       }
	   }
}
