package MyCollection;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add("santhosh");
hs.add("prabhu");
hs.add("vijay");
hs.add("magesh");
hs.add("lokesh");
hs.add("tamil");
System.out.println(hs);
java.util.Iterator itr=hs.iterator();
System.out.println("  Using Iteraotor:  ");
while(itr.hasNext())
{
	System.out.println(itr.next());
}

	}

}
