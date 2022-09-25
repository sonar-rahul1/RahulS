package Collection;

import java.util.LinkedHashSet;



public class HashwithDublicate {

	public static void main(String[]args)
	{
		String a="JAVA";
		char []abc=a.toCharArray();
		LinkedHashSet ls=new LinkedHashSet();
		for(Object O:abc)
		{
			ls.add(O);		}
	
	for(Object xyz:ls)
	{
	   System.out.println(xyz);
	}
}
}