package roughprogram;

public class Execption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		try{
		int c=a/b;
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e);
		}


	}

}
