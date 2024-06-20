package javaConditionalLoops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		int start = 0, end = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter start value: ");
		start = scanner.nextInt();
		
		System.out.println("enter end value: ");
		end = scanner.nextInt();
		
		System.out.println("enter number for which you want to print table : ");
		int num = scanner.nextInt();
		
		scanner.close();
		
		for(int i = start; i <= end; i++)
		{
			System.out.println(i*num);
		}
		
	}

}
