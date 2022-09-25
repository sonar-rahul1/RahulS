package Collection;

import java.util.ArrayList;

public class DublicatChar {
	public static void main(String[]args) {
		String a= "Rahul Ravindra Sonar";
		
//		char[]abc=a.toCharArray();
//		ArrayList arr=new ArrayList();
//		for(Object O:abc)
//		{
//			arr.add(O);
//			
//		}
//	System.out.println();
	for(int i=a.length()-1;i>=0;i--)
	{
		System.out.println(a.charAt(i));
	}
	}
}
