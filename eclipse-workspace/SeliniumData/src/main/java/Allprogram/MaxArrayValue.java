package Allprogram;

public class MaxArrayValue {

	public static void main(String[] args) {
		int[]abc= {1,2,55,24,68,256};
		int max=Integer.MIN_VALUE;
		for(int elemenet:abc)
		{
			 if(elemenet>max)
			 { 
				 max=elemenet;
			 }
		}
		System.out.println("max value is:"+max);
	}

}
