package Collection;

import java.util.LinkedHashSet;

public class HashSetdublicat1 {

public static void main(String[] args) {

	String a="JAVA";
	char[]abc=a.toCharArray();
	LinkedHashSet ls=new LinkedHashSet();
	for(Object o:abc)
	{
		ls.add(o);
	}
	for(Object xy:ls)
	{
		System.out.println(xy);
	}
}
}
