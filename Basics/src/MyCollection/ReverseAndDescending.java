package MyCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ReverseAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>names=new ArrayList<String>();
names.add("Volve");
names.add("BMW");
names.add("Audi");
names.add("Benz");
System.out.println(names);
Collections.sort(names);
System.out.println(names);
System.out.println(Collections.binarySearch(names,"i10"));
Collections.reverse(names);
System.out.println(names);

TreeSet<String>ts=new TreeSet<String>();
ts.add("ram");
ts.add("jai");
ts.add("sandy");
ts.add("jam");
ts.add("sim");
System.out.println(ts);
TreeSet<String>rev=(TreeSet<String>)ts.descendingSet();
System.out.println(ts);
System.out.println(ts.contains("santhosh"));


	}

}
