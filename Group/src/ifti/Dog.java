package ifti;

import java.util.ArrayList;

public class Dog {

	private int position;

	// constructor
	public Dog(int position) {
		this.position = position;
	}

	// getter method to add position of dog
	public int getPosition() {
		return position;
	}

	// set the position of the dog
	public void setPosition(int position) {
		this.position = position;
	}

	public int position() {

		// ArrayList<Integer> d = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {

			switch (i) {
			case 11:
				System.out.print(i + "th, ");
				break;
			case 12:
				System.out.print(i + "th, ");
				break;
			case 13:
				System.out.print(i + "th, ");
				break;
			case 100:
				System.out.print(i + "th");
				break;
			}

			// d.add(i);
			if (position != i && i % 10 != 1 && i % 10 != 2 && i % 10 != 3 && i != 100) {
				System.out.print(i + "th, ");
			}

			else if (i % 10 == 1 && i != 11) {
				System.out.print(i + "st, ");
			}

			else if (i % 10 == 2 && i != 12) {
				System.out.print(i + "nd, ");
			}

			else if (i % 10 == 3 && i != 13) {
				System.out.print(i + "rd, ");
			}

			if (i % 20 == 0) {
				System.out.println();
			}

			// System.out.println(d);
			// if(i)
		}
		return position;
	}
}
