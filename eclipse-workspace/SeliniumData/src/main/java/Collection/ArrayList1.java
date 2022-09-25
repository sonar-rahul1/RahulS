package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
      ArrayList abc=new ArrayList();
      abc.add("Rahul");
      abc.add(true);
      abc.add(100);
      abc.add(null);
      abc.add("Sonar");
      System.out.println(abc);
      ArrayList xyz=new ArrayList();
      xyz.add(100);
      xyz.add("chopda");
      xyz.add("Selenium");
      xyz.add("JAVA");
      System.out.println(xyz);
    //  System.out.println(abc.size());
      //System.out.println(abc.get(4));
      System.out.println(xyz.addAll(abc));
      
      
	}

}
