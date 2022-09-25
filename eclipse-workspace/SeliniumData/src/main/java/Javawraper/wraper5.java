package Javawraper;

public class wraper5 {

	public static void main(String[] args) {
       String a="Rahul Ravindra Sonar";  //rAHUL rAVINDRA sONAR
       
      String []b=a.split(" ");
      
    // System.out.println(b[0].substring(0,1).toLowerCase()+b[0].substring(1).toUpperCase());
     // System.out.println(b[1].substring(0,1).toLowerCase()+b[1].substring(1).toUpperCase());
      for(int i=b[2].length()-1;i>=0;i--)
    	  
      {
    	  System.out.println(b[i]);
      }
    //  System.out.println(b[2].substring(0,1).toLowerCase()+b[2].substring(1).toUpperCase());
     
	}
}