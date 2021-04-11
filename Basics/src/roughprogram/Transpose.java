package roughprogram;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]={{4,5,6},{86,13,56},{67,18,19}};
int b[][]= new int[3][3];
System.out.println("transpose");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		b[i][j]=a[j][i];
	System.out.print(b[i][j]+"       ");
}
	System.out.println();
	
}}}

	


