package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1{
	public static void main(String[] args) {

		HashMap h = new HashMap();

		h.put("First Name", "Pallavi");
		h.put("Last Name", "Patil");
		h.put("Job", "software Test Engineer");
		h.put("Address", "Pune");

		Set abc = h.entrySet();

		for (Object o : abc) 
		{
			Map.Entry m = (Map.Entry) o;

			System.out.println(m.getKey());
			
			System.out.println(m.getValue());
		}
	}
}
