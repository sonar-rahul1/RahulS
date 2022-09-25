package Collection;

import java.util.LinkedHashSet;

public class LinkedHashset1{

	public static void main(String[] args) {
		
		LinkedHashSet hs = new  LinkedHashSet();
		hs.add("selenium");
		hs.add("Java");
		hs.add(100);
		hs.addAll(hs);
		System.out.println(hs);
		System.out.println(hs.add(200));
		System.out.println(hs.getClass(1));
		
	}

}
