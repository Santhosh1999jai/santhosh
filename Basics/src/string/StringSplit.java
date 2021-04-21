package string;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Narayanaswamy resigns as puducherry an after majority in assembly";
String ss[]=s.split(" ");
int counter=0;
for(int i=0;i<ss.length;i++)
{
	if(ss[i].contains("a"))
	{
		counter=counter+1;
	}
}
System.out.print("count"+counter);
	}

}
