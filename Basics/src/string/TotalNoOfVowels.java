package string;

public class TotalNoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="Malala got nobel prize for peace";
	int count=0;
	char c[]=new char[s.length()];
	for(int i=0;i<c.length;i++)
	{
		c[i]=s.charAt(i);
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
		{
			count=count+1;
		}
		System.out.print(c[i]);
	}
		System.out.println();
	System.out.print("count"+count);
}
}