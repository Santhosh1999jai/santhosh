package string;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="she sells sea shells on the sea shore. she sells in marina beach";
String ss[]=s.split(" ");
String search="she",replace="mala";
for(int i=0;i<ss.length;i++)
{
	if(ss[i].equals(search))
	{
		ss[i]=replace;
	}
System.out.print(ss[i]+"  ");
}
	}

}
