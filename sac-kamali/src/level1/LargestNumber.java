package level1;

public class LargestNumber {

	public static void main(String[] args) {
		double n1=-5.9, n2=8.3, n3=9.0;
		if(n1>=n2 && n1>=n3)
			System.out.println(  n1   +"is the largest number");
		else if (n2>=n3 && n2>=n1)
			System.out.println(  n2  +"is the largest number");
		else
			System.out.println(  n3  + "is the largest number");
		// TODO Auto-generated method stub

	}

}
