package Collection;

public class palindrome {

	 public static void main(String args[]){  

    int n,sum=0,temp ,r;
    n=414;
         temp=n;
    while(n>0)
    {
    	r=n%10;
    	sum=(sum*10)+r;
    	n=n/10;
    }
    if(temp==sum)
    {
    	System.out.println("no is palindrome");
    	
    }
    else {
    	System.out.println("no not palindrome");
    }
	 }
}