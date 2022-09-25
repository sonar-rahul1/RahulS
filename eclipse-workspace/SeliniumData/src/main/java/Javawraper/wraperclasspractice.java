package Javawraper;

public class wraperclasspractice {
	
	public static void main(String []args)
	{
		
		String a= "Rahul Ravindra Sonar";
		String[]abc =a.split(" ");
		
		System.out.println(abc[0].substring(0,1).toLowerCase()+abc[0].substring(1).toUpperCase());
}
}