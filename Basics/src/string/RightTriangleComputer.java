package string;

public class RightTriangleComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Computer";
		char c[]=s.toCharArray();
		for (int i = 0; i <=c.length; i++)
			{
			for(int j=0;j<=i;j++)
			{
				c[i]=s.charAt(j);
				c[j]=c[i];
				System.out.print(c[j]+"  ");
			}
			System.out.println();
		}
	}

}
