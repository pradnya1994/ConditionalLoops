package javaConditionalLoops;

import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
		
		int start = 0, end = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter start value: ");
		start = scanner.nextInt();
		
		System.out.println("enter end value: ");
		end = scanner.nextInt();
		
		System.out.println("enter number(*what number table you want): ");
		int num = scanner.nextInt();
		
		scanner.close();
		
		for(int i = start; i <= end; i++)
		{
			System.out.println(num+" * "+i+" = "+i*num);
		}
		
	}

}
