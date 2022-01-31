package level1;

import java.util.Scanner;

public class printANumber {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = reader.nextInt();
		
		System.out.println("The number you printed is" + number);
	}

}
