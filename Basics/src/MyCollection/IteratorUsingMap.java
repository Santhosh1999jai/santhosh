package MyCollection;

import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> Directory=new TreeMap<Integer,String>();
Directory.put(123456," santhosh");
Directory.put(1234," vijay");
Directory.put(12345," ram");
Directory.put(9876," prabhu");
Directory.put(5674," logesh");
Directory.put(78643," aakash");
System.out.println(Directory);
for (Integer name : Directory.keySet())
    System.out.println("key: " + name);
    for (String url : Directory.values())
        System.out.println("value: " + url);
System.out.println("Using Iterator in map");

{
	}
}}
