package myLittlePony;

public class Practice {
	
	public static String helloWorld() {
		return "Hello World! 2";		
	}
	
	public static void stringMethod (String param) {
		System.out.println(param);
	}
	
	public static void stringMethod () {
		System.out.println("Hello World 4 - override");
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int conditional1(int a, int b, boolean var) {
		if(var) {
			return a + b;
			}
		
		else {
			return a*b;
		}
	}
	
	public int conditional1(int a, int b) {
		
		if(a==0) {
			return b;
		}
		
		else if(b==0) {
			return a;
					}
		else {
			return a+b;
		}
		}
	}
	

