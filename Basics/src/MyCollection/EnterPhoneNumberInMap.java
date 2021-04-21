package MyCollection;

import java.util.Scanner;
import java.util.TreeMap;

public class EnterPhoneNumberInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
Scanner sc=new Scanner(System.in);
System.out.println("enter how many phone number and names are you going to enter:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	System.out.println("enter phone number:");
	Integer key=sc.nextInt();
	System.out.println("enter names:");
	String value=sc.next();
	tm.put(key,value);
}
System.out.println(tm);
System.out.println("enter phone number to search in directory:");
Integer u=sc.nextInt();
System.out.println(tm.get(u));
	}

}
