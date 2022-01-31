package level1;
import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		
		System.out.println("Enter the side of the square");
		Scanner squ = new Scanner(System.in);
		
		double side = squ.nextDouble();
		double area = side*side;
		System.out.println("The area of the square is"  + area);
		// TODO Auto-generated method stub

	}

}
