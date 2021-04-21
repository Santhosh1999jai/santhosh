package MyCollection;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList numbers=new ArrayList();
numbers.add(6);
numbers.add(4);
numbers.add(2);
numbers.add(12);
numbers.add(9);
for(int i=numbers.size()-1;i>=0;i--)
{
	System.out.println(numbers.get(i)+"  ");
}
	}

}
