package MyCollection;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.TreeSet;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();//creating list container
		al.add("B");//adding elements to the container
		al.add("A");//adding elements to the container
		al.add("C");//adding elements to the container
		al.add("A");//adding elements to the container
		System.out.println(al);//printing all the elements in the list container
		TreeSet ts=new TreeSet();//Creating set container
		ts.addAll(al);//Transferring all the elements in the list to set
		System.out.println(ts);//Printing all the elements in the set container

	}

}
