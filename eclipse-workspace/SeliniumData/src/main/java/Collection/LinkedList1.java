package Collection;

import java.util.LinkedList;

public class LinkedList1{

	public static void main(String[] args) {
		
		LinkedList ls=new LinkedList();
		ls.add("Selenium");
		ls.add("Sonar");
		ls.add("Rahul");
		ls.add(100);
		System.out.println(ls);
		
		LinkedList abc=new LinkedList();
		abc.add(100);
		abc.add("Rahul");
		abc.add("Sonar");
		System.out.println(abc);
		abc.addAll(ls);
		System.out.println(abc);
		abc.addFirst(100);
		abc.addLast(200);
			System.out.println(abc);
	}
}