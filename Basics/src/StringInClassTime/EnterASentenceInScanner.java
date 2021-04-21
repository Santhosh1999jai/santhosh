package StringInClassTime;

import java.util.Scanner;

public class EnterASentenceInScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("eneter a sentence :");
		char s = sc.next().charAt(2);
		sc.close();
		System.out.println(s);
	}

}
