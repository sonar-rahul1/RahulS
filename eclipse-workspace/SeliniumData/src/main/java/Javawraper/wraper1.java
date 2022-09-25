package Javawraper;



public class wraper1 {
	public  void main(String[]args) {
	int a=11;
	boolean prime=true;
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
		{
			prime=false;
		}
	}
	System.out.println(prime);
	}	
}