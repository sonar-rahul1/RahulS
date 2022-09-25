package Allprogram;
import java.util.ArrayList;
public class ReverseByarray {

	public static void main(String[] args) {
		String a="Selenium is best option";
		char[]abc=a.toCharArray();
		ArrayList arr=new ArrayList();
		for(Object O:abc) {
			arr.add(O);
			
		}
		for(int i=arr.size()-3;i>=0;i--)
		{
			System.out.println(arr.get(i));
		}
	}

}
