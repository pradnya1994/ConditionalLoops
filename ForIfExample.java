package javaConditionalLoops;

public class ForIfExample {
;
	public static void main(String[] args) {
		
		//String name = "Ajay";
		
		String names[] = {"Pradnya", "Mukund", "Raghav", "Aarya"};//100
		
		
		for(int i = 0; i < 4; i++)//i++ => i = i+1
		{
			if(i == 1)
			{
				break;
			}
			System.out.println(names[i]);
		}
		
		
	}

}
