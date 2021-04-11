package JCS;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 104;
		int b = 56;
		int c = 700;
		if (a > b && a > c)
		{
			System.out.println(a);
		}
		else
		{

			if (b > c && b > a) 
			{
				System.out.println(b);
			} else {
				System.out.println(c);
			}

		}

	}
}