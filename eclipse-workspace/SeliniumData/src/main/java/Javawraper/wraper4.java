package Javawraper;

public class wraper4 {

	public static void main(String[] args) {
         String a="selenium with java";
		
		String [] abc =a.split(" ");
		
		for(int i=0;i<abc.length;i++)
		{
			System.out.println(abc[i].substring(0,1).toUpperCase());
		}	
	}
}
