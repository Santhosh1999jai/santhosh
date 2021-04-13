package string;

public class TotalNoOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="malala got nobel prize for peace";
char c[]=new char[s.length()];
int count=0;
for(int i=0;i<c.length;i++)
{
	c[i]=s.charAt(i);
	{
	count=count+1;
System.out.print(c[i]);
}
}
System.out.println();
System.out.print("count"+count);
	}
}

