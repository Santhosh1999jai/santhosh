package MyCollection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class userListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//enter n names until exit is entered
Set set=new TreeSet();//creating set container
Scanner sc=new Scanner(System.in);//to get values from console
String s="";//empty string
while(!s.equalsIgnoreCase("exit"))//s not equal to exit
{
	System.out.println("Enter name");
	s=sc.nextLine();
	set.add(s);
}
System.out.println(set);
	}

}
