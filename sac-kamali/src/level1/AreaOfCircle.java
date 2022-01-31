package level1;

import java.util.Scanner;


public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of the circle");
		Scanner circle = new Scanner(System.in);
		double radius = circle.nextDouble();
		double area = Math.PI*(radius*radius);
		System.out.println("The area of the circle is"  + area);
		double circumference = Math.PI*2*radius;
		System.out.println("The circumference of the circle"+ circumference);
		

	}

}
