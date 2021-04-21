package MyCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet numbers=new HashSet();
numbers.add(5);
numbers.add(3);
numbers.add(7);
numbers.add(8);
numbers.add(9);
numbers.add(1);
ArrayList al=new ArrayList();
al.addAll(numbers);
int a[]=new int[numbers.size()];
for(int i=0;i<a.length;i++)
{
	a[i]=(int)al.get(i);
	System.out.println(a[i]+" ");
}
	}

}
