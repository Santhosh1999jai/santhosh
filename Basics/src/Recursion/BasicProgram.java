package Recursion;

public class BasicProgram {
	void m(int i) {
		System.out.println(i);
		i++;
		if (i <= 10) {
			m(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicProgram obj = new BasicProgram();
		obj.m(1);

	}

}
