package level1;

public class PyramidExampleReverse {

	public static void main(String[] args) {
		int term=4;
		for(int i =1; i<=term; i++)
		{
			for(int j=term; j>=i; j--)
			{
				System.out.println("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
