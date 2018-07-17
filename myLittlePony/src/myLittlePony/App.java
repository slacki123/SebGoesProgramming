package myLittlePony;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello world 1");
		String hello = Practice.helloWorld();
		System.out.println(hello);
		Practice.stringMethod("Hello World 3");
		Practice.stringMethod();
		System.out.println(Practice.add(1, 2) + " - the add method");
		System.out.println(Practice.conditional1(2,3,true));
		System.out.println(Practice.conditional1(3,3,false));
		
		Practice hey = new Practice();
		
		System.out.println(hey.conditional1(3,3,false) + " - with object called from static");
		System.out.println(hey.conditional1(1, 0) + " - from public");
		System.out.println(hey.conditional1(1, 2) +"- from public 2");
	}

}
