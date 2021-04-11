package Array;

public class DiagonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c[][]=new int[3][3];
for(int i=0;i<c.length;i++)
{
	for(int j=0;j<c[i].length;j++)
	{
		if(i==j)
		{
			c[i][j]=1;
		}
			System.out.print(c[i][j]+"   ");
	}
		
		System.out.println();
	
}
	}

}
