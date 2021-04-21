package MyCollection;

import java.util.HashMap;

public class MapUsingZomato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> zomato=new HashMap<Integer,String>();
zomato.put(123,"ram");
zomato.put(321,"sandy");
zomato.put(132,"azar");
zomato.put(123,"com");//duplicate in key is not allowed
zomato.put(453,"ram");//duplicate in value is allowed
System.out.println(zomato);
	}

}
