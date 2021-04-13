package string;

public class TotalNoOfConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="malala got nobel prize for peace";
int count=0;
char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
	c[i]=s.charAt(i);
	if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
	{
}
	else
	{
		count=count+1;
	}	
	System.out.print(c[i]);
}
System.out.print(count);
	}

}
