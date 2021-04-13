package Pattern;

public class CrossLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=6;
 for(int i=0;i<=n;i++)
 {
	 for(int j=1;j<=n;j=j+1)
	 {
		 if(i==j)
		 {
			 System.out.print("*");
			 System.out.println();
		 }
		 else
			 System.out.print(" ");
	 }
 }
	}

}
