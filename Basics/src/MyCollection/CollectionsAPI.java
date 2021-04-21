package MyCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String>ts=new TreeSet<String>();
ts.add("ram");
ts.add("jai");
ts.add("xyz");
ts.add("abc");
System.out.println(ts);
Iterator itr=ts.iterator();//to iterate each element one by one
while(itr.hasNext())//to check if iterator has next element
{
	System.out.println(itr.next());//to print that element
}
	}

}
