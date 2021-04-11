package Array;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 7, 9, 3 }, { 2, 1, 11 }, { 4, 1, 3 } };
		int b[][] = new int[3][3];

		System.out.println("Before T");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("After T");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[j][i];
				System.out.print(b[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
