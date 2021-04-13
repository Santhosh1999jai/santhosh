package Pattern;

public class ChristmasTree {

	public static void main(String[] args) {

		for (int h = 1; h <= 4; h++) {

			int n=5;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}

			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
				
				System.out.println();
				}
			
		}
		
		// stem
		for(int y = 1 ; y <=6 ; y++)
		{
			System.out.println("   * *");
		}

	}

}
