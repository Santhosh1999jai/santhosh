package string;

public class CheckIfCharZIsPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malala got Nobel prize for peace";
		boolean flag=false;
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
		c[i]=s.charAt(i);
		if(c[i]=='z')
			flag=true;
		}
		System.out.print(flag);
	}	}


