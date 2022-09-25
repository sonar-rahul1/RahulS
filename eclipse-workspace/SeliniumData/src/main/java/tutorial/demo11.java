package tutorial;

import java.util.LinkedHashSet;

//import java.util.Scanner;


public class demo11 {

	public static void main(String[] args) {
		
	String a="Selenium is better option";
	
	char[]abc=a.toCharArray();
	LinkedHashSet ls=new LinkedHashSet();
	
	for(Object O:abc)
	{
		ls.add(O);
		
	}
	for(Object xyz:ls)
	{
		System.out.println(xyz);
	}
	}
	
}

