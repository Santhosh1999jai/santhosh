package StringInClassTime;

import java.util.Scanner;

public class ToGetValuesOrInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter a:");
int a=sc.nextInt();
System.out.print("enter b:");
int b=sc.nextInt();
int c=a+b;
System.out.print("sum value"+c);
sc.close();
	}

}
