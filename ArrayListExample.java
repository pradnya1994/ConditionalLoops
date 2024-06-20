package javaConditionalLoops;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
;
	public static void main(String[] args) {
		
		
		//String names[] = {"Pradnya", "Mukund", "Siddhi", "Anup"};
		
		
		List<String> names = new ArrayList<String>();
		names.add("Pradnya");
		names.add("Mukund");
		names.add("Siddhi");
		names.add("Anup");
		
		for(String name: names)
		{
			System.out.println(name);
		}
		
		System.out.println("-------------------------------");
		
		names.forEach(name -> System.out.println(name));
		
	}

}
