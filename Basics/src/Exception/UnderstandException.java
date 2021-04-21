package Exception;

public class UnderstandException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(1 / 0);
		} catch (ArithmeticException e) {
			System.out.print(2 + 2);
		}
		
		finally
		{System.out.println();
			System.out.print(1+2);
		}
	}

}
