package Array;

public class ToRemoveDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 7, 1, 4, 5,8,9, 3, 2, };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i]==a[j]) {
a[j]=0;
				}
			} 
		}
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println (a[i]);
		}
		
		
		
		
	}
}