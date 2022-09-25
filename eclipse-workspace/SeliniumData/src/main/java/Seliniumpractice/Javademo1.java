package Seliniumpractice;

public class Javademo1 {
	
	public void pune()
	{
		String b="Amiy";
		for(int i=b.length()-1;i>=0;i--)
		{
			System.out.println(b.charAt(i));
		}
	}
	public void mumbai()  
	{
		System.out.println("Main method is working");
	}
	
	public static void main(String[] args) {
		
	         System.out.println("Main method is started");
	         Javademo1 obj=new Javademo1();
	         obj.pune();
	         obj.mumbai();
	         System.out.println("Main method is ended");

	}

}
