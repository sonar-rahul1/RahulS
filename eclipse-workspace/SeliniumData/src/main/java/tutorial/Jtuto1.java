package tutorial;

public class Jtuto1 {

	public static void main(String[] args) {
		
        String a="Rahul";
        String b="Rahul";
        String c="bahul";
        System.out.println(a.equalsIgnoreCase(b));//true
        System.out.println(a.equalsIgnoreCase(c));//false
        System.out.println(a==b);//true
        System.out.println(a==c);//false
        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//false
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
}
}
