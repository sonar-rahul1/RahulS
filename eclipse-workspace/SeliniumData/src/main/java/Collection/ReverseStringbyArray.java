package Collection;

import java.util.ArrayList;

public class ReverseStringbyArray {

	public static void main(String[] args) {
		 String a = "Rahul Ravindra Sonar";
		    char[]abc=a.toCharArray();
		  ArrayList arr = new ArrayList();
		   for(Object O:abc)
		   {
		      arr.add(O);
		    }
		  System.out.println();
		  for(int i=arr.size()-1;i>=0;i--)
		  {
		    System.out.print(arr.get(i));
		  }
         
	}

}
