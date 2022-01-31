package level1;

import java.util.Scanner;


public class WhileLoopDemo {

	public static void main(String[] args) {
		int number, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer value between 0 and 10");
		number = sc.nextInt();
		while(number <=10) {
			sum=sum+number;
			number++;
		}
		System.out.format("sum of the numbers from the while loop is"+ sum);
		// TODO Auto-generated method stub

	}

}
