package string;

public class UsingStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="mon";
String s1="";
char c[]=s.toCharArray();
for(int i=c.length-1;i>=0;i--)
{
	s1=s1+c[i];
}
{
	System.out.print(s1);
	System.out.println();
}
if(s.equals(s1))
{
	System.out.print("palindrome");
}
else
System.out.print("not a palindrome");

	}

}
