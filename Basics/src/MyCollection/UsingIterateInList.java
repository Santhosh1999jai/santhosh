package MyCollection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class UsingIterateInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(5);
al.add(6);
al.add(3);
al.add(6);
al.add(8);
System.out.println(al);
java.util.Iterator itr=al.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
