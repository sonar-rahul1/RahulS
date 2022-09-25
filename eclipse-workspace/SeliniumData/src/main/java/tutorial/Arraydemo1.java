package tutorial;

public class Arraydemo1 {

	public static void main(String[] args) {
       
		String abc[] = new String[10];
		abc[0] = "Selenium WebDriver";
		abc[1] = "TestNG (Next Generation)";
		abc[2] = "Java Script Executor Interface";
		abc[3] = "Cucumber";
		abc[4] = "POM -Page Object Model";
		abc[5] = "Git hub";
		abc[6] = "Jenkins";
		abc[7] = "HTML";
		abc[8] = "API Automation using Rest Assured";
		abc[9] = "Database Automation Testing using JDBC";

		
		for(int i=0;i<abc.length;i=i+2)
		{
			System.out.println(abc[i]);
		}
				
	}

}
