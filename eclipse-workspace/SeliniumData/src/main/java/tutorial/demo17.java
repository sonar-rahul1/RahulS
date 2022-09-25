package tutorial;

public class demo17 {

	public static void main(String[] args) {
		
		
		String []abc = new String[6];
			
			abc[0]="Selenium";
			
			abc[1]="testNg";
			
			abc[2]="cucumber";
			
			abc[3]="POM";
			
			abc[4]="github";
			
			abc[5]="Cucumber";
			
			for(int i=0;i<6;i++)
			{
				 if(abc[i].equalsIgnoreCase("cucumber"))
				 {
					 System.out.println("Test case is pass");
				 }
			}
			
	 }
}
	