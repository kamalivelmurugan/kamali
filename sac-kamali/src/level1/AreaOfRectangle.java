package level1;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rect = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle...");
		double length = rect.nextDouble();
		System.out.println("Enter the width of the rectangle....");
		double width = rect.nextDouble();
		double area = length*width;
		System.out.println("The area of the rectangle is"  + area);

	}

}
