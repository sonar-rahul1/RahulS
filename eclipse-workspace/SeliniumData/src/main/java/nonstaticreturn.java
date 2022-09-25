

public class nonstaticreturn {

	
		
	//static global variable
		static String city="Pune";
		//non static global variable
		String topic="Selenium";
		
		public static void m1() {
			//local variable
				int a=100;
				System.out.println(a);
				System.out.println(city);
				nonstaticreturn obj =new nonstaticreturn();
				
				System.out.println(obj.topic);
		}

		public void m2() {
			System.out.println(city);
			System.out.println(topic);
			int b=100;
			System.out.println(b);
			System.out.println("M2 non static method in Demo1 class");//2
		}

		public void m3() {
			System.out.println(city);
			System.out.println(topic);
			System.out.println("M3 non static method in Demo1 class");//3
		}

		public static void main(String[] args) {
			System.out.println(city);
			String c ="Selenium";
			System.out.println(c);
			m1();
			
			nonstaticreturn obj =new nonstaticreturn();
			//obj.m2();
			obj.m3();
			System.out.println(obj.topic);
			
		}

	}