package Javawraper;

public class wraper2 {

	public static void main(String[] args) {
		String b="Rah22@@10ul";
		char[]xyz=b.toCharArray();
		for(int i=0;i<xyz.length;i++)
		{
			if(Character.isAlphabetic(xyz[i]))
			{
				System.out.println("Alphabetic:"+xyz[i]);
				
			}
			else if(Character.isDigit(xyz[i]))
			{
				System.out.println("Digit value:"+xyz[i]);
			}
			else
			{
					System.out.println("Special char:"+xyz[i]);
			}
		}
	}

}

