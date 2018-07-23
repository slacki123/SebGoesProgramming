package workingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("John", "Doctor", 31);
		Person p2 = new Person("James", "Engineer", 22);
		Person p3 = new Person("Joe", "Shopkeeper", 41);
		Person p4 = new Person("Jake", "Student", 17);
		Person p5 = new Person("Julian", "Farmer", 26);

		ArrayList<Person> list = new ArrayList<Person>();
		Collections.addAll(list,p1,p2,p3,p4,p5);

		BufferedWriter bw = null;
		String lineSep = System.getProperty("line.separator");
		try {

			File file = new File("C:\\Users\\Profile\\Documents\\SebWorkspace\\myfile.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			System.out.println("Writing...");
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for (Person p : list) {
				String name = p.getName();
				String occupation = p.getOccupation();
				int age = p.getAge();
				bw.write(name + " " + occupation + " " + age + " " + lineSep);

				System.out.println(p);
			}

			System.out.println("File written Successfully\n");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}

		// reader
		BufferedReader br = null;
		ArrayList<Person> readPerson = new ArrayList<Person>();
		try {
			System.out.println("Reading...");
			br = new BufferedReader(new FileReader("C:\\Users\\Profile\\Documents\\SebWorkspace\\myfile.txt"));
			for (int i = 0; i < list.size(); i++) {
				String line = br.readLine();
				String[] splitted = line.split("\\s+");
				
				String name;
				String occupation;
				int age;
				
				name = splitted[0];
				occupation = splitted[1];
				age = Integer.parseInt(splitted[2]);
				
				
					readPerson.add(new Person(name,occupation,age));
					
				}
			for(Person i: readPerson) {
				System.out.println(i.getName() + " " + i.getOccupation() + " " + i.getAge());
			}
			System.out.println("\nReading complete.");
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
