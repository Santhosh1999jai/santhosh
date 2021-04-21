package MyCollection;

import java.util.ArrayList;

public class AddAndRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList cities=new ArrayList();
cities.add("chennai");
cities.add("mumbai");
cities.add("bangalore");
cities.add("madurai");
System.out.println(cities);
cities.remove(2);
System.out.println(cities);
cities.add(2,"delhi");
System.out.println(cities);
	}

}
