package intermediate;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Intermediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//question 1
		System.out.println("Question 1:");
		Blackjack bj = new Blackjack();
		System.out.println(bj.blackjack(20, 28));
		
		System.out.println("Question 2:");
		UniqueSum us = new UniqueSum();
		System.out.println(us.uniqueSum(new int[]{5,5,1,2}));
		
		System.out.println("Question 3:");
		TooHot th = new TooHot();
		System.out.println("Is it summer?: " + th.isSummer(70));
		
	

	}

}