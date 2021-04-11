package Array;

public class FirstMiddleLastElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 2, 4, 5,6,8};
		System.out.println(a[0]);// first element
		{
			if (a.length % 2 == 0) //middle element
			{
				System.out.println(a[a.length / 2]);
				System.out.println(a[a.length / 2 - 1]);
			} 
			else {
				System.out.println(a[a.length / 2]);

			}
		}
		System.out.println(a[a.length - 1]);//last elements

	}

}
