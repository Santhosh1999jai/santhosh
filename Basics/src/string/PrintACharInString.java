package string;

public class PrintACharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="mala and kamala are friends";
String ss[]=s.split(" ");
for(int i=0;i<ss.length;i++)
{
	if(ss[i].contains("a"))
	{
		
		System.out.println(ss[i]);
	}
}

	}

}
