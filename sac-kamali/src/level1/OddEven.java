package level1;
import java.util.Scanner;


public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(num%2==0)
		System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	
		

	}

}
