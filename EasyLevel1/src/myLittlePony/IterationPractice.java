package myLittlePony;

public class IterationPractice {
	
	public static void main(String[] args) {
	
		Practice iter = new Practice();
	
		for(int i = 0; i<10; i++) {
			System.out.println(iter.conditional1(i, i) + " - This is iteration number " + (i+1));
		}
		//question 9
		int[] array = {1,3,5,3,2,6,3,2,6,1};
		for(int a = 0; a<array.length;a++) {
			System.out.println(iter.conditional1(array[a], array[a]) + " -iter no " + (a+1));
		}
		//question 10
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Question 11");
		//question 11
		int[] array2 = new int[10];
		for(int i =0; i<array2.length; i++) {
			array2[i]=i+1;
			System.out.print(array2[i] + ", ");
			if(i==9) {
				System.out.println();
			}
			
		}
		for(int i =0; i<array2.length; i++) {
			System.out.print(array2[i]*10 + ", ");
		}

	

}
}
