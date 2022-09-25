package Allprogram;

public class MinArrayValue {

	public static void main(String[] args) {
		int[]abc= {1,12,25,23,0};
		  int min=Integer.MAX_VALUE;
		  for(int elemenet:abc)
		  {
			   if(elemenet<min)
			   {
				   min=elemenet;
			   }
		  }
		  System.out.println("Min value is:"+min);
	}

}
