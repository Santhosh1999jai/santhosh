package MyCollection;

import java.util.ArrayList;

public class SearchInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Homogenous-generics-ensure type safety
ArrayList<String>names=new ArrayList<String>();
names.add("volvo");
names.add("audi");
names.add("BMW");
names.add("benz");
System.out.println(names);
//Homogenous-generics-ensure type safety
ArrayList<Integer>quantity=new ArrayList<Integer>();
quantity.add(25);
quantity.add(26);
quantity.add(11);
quantity.add(24);
System.out.println(quantity);
//homogenous-generics-ensure type safety
ArrayList<Integer>year=new ArrayList<Integer>();
year.add(1997);
year.add(1998);
year.add(1996);
year.add(1999);
System.out.println(year);
//hetrogenous-collection of collection
ArrayList al=new ArrayList();
al.add(names);
al.add(quantity);
al.add(year);
System.out.println(al);
System.out.println(al.get(0));
System.out.println(al.get(1));
	}

}
