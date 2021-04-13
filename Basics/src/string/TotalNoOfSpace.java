package string;

public class TotalNoOfSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malala got Nobel prize for peace";
		int count=0;
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			 c[i]=s.charAt(i);
			if(c[i]==' ')
			{
				count=count+1;
			}
		System.out.print(c[i]);
		
		}
		System.out.println();
		System.out.print("count"+count);
	}

}
