package Javawraper;

public class wraperRevision1 {

	public static void main(String[] args) {
		
		String v="Rahul Ravindra Sonar";
		String[] b=v.split(" ");
		System.out.println(b[0].substring(0,1).toLowerCase()+b[0].substring(1).toUpperCase());
		System.out.println(b[1].substring(2,3).toUpperCase());
	}

}
