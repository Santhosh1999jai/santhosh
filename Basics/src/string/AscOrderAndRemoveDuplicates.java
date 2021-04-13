package string;

public class AscOrderAndRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="malala get nobel Prize for peace";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
	c[i]=s.charAt(i);
}
for(int i=0;i<c.length;i++)
{
	for(int j=i+1;j<c.length;j++)
	{
	if(c[i]>c[j])
	{
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	}
{
	if(c[i]==c[j])
	{
		c[i]=' ';
	}
}
	
	}
	System.out.print(c[i]);
	}

	}
}
