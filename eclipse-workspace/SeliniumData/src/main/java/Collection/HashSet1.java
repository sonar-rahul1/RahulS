package Collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.addAll(hs);
		System.out.println(hs);
		HashSet hs1 = new HashSet();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.addAll(hs1);
		hs1.addAll(hs);
		System.out.println(hs1);
		System.out.println(hs1.contains(hs));
		System.out.println(hs1.isEmpty());
		hs1.removeAll(hs1);
		System.out.println(hs1);
	}

}
  