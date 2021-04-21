package MyCollection;

import java.util.ArrayList;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={5,6,7,8,9,24,7};
ArrayList<Integer>al=new ArrayList<Integer>();
for(int i=0;i<a.length;i++)
{
	al.add(a[i]);
}
System.out.println(al);
	}

}
