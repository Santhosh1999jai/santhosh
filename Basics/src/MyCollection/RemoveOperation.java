package MyCollection;

import java.util.ArrayList;

public class RemoveOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>names=new ArrayList<String>();
names.add("Volvo");
names.add("bmw");
names.add("audi");
names.add("benz");
System.out.println(names);
//names.remove(2);//To remove an element in a particular index
names.add(2,"honda");
System.out.println(names);//To remove an element based on its value
System.out.println(names.indexOf("i10"));
System.out.println(names.get(2));
System.out.println(names.contains("swift"));
	}

}
