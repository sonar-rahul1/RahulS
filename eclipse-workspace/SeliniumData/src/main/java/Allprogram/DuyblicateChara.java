package Allprogram;
import java.util.LinkedHashSet;
public class DuyblicateChara {

	public static void main(String[] args) {
	String str="rahul Sonar";
	char[]abc=str.toCharArray();
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
