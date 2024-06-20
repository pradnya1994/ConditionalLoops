package javaConditionalLoops;

public class ForEach {
;
	public static void main(String[] args) {
		
		
		String names[] = {"Pradnya", "Mukund", "Siddhi", "Anup"};
		
		
		for(int i = 0; i < 4; i++)//i++ => i = i+1
		{
			System.out.println(names[i]);
		}
		
		System.out.println("-------------------------------");
		
		for(int i = 3; i >= 0; i--)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("-------------------------------");
		
		for(String name: names)
		{
			System.out.println(name);
		}
		
	}

}
