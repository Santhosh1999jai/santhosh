package string;

public class StringWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mala and kamala are friends";
		String s1="";
		String ss[]=s.split(" ");
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			s1=s1+c[i];
		}
		{
			System.out.print(s1);
			System.out.println();
	}

}}
