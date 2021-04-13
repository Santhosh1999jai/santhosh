package string;

public class JavaRightToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";
		char c[]=s.toCharArray();
		for (int i=0; i >=c.length; i++)
			{
			for(int j=0;j<=i;j++)
			{
				c[i]=s.charAt(j);
				c[i]=c[j];
				System.out.print(c[i]+"  ");
			}
			System.out.println();
		}

	}

}
