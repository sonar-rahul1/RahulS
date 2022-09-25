package JAVA;

import java.util.Scanner;

public class primenoscanner {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first no");
       int start=sc.nextInt();
       System.out.println("Enter second no");
       int end=sc.nextInt();
       System.out.println("List of prime no between"+start+""+end);
       for(int i=start;i<=end;i++)
       {
    	   if(isPrime(i))
    	   {
    		   System.out.println(i);
    		   
    	   }
       }
	}
	 public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) 
	           {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	

	}


