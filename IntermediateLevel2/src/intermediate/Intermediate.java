package intermediate;

import java.util.ArrayList;
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
		System.out.println(us.uniqueSum(new int[]{5,1,2}));
		
		System.out.println("Question 3:");
		TooHot th = new TooHot();
		System.out.println("Is it summer?: " + th.isSummer(70));
		
		System.out.println("Question 4: ");
		Person john = new Person("John", 21, "Farmer");
		Person jake = new Person("Jake", 37, "Doctor");
		Person matt = new Person("Matt", 29, "Stay at home mum");
		
		ArrayList<Person> peopleList = new ArrayList<>();
		peopleList.add(john);
		peopleList.add(jake);
		peopleList.add(matt);
		
		for(Person a : peopleList) {
			System.out.println(a);
		}
		String searchName = "John";
		System.out.println("Search name: " + searchName);
		People people = new People(peopleList);
		System.out.println(people.search(searchName));


	}

}
