package MyCollection;

public class NPDTypeConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integer to string
//int i=10;
//String s=String.valueOf(i);
//System.out.println(i+10);
//System.out.println(s+10);

//Double to String
double d=10.5;
String x=String.valueOf(d);
System.out.println(d+10.5);//concat
System.out.println(x+10.5);//add

//Char to String
char c='j';
String s=String.valueOf(c);
System.out.print(c);

//String to Integer
String s1="100";
int i=Integer.parseInt(s1);
System.out.println(s1+10);//concat
System.out.println(i+10);//add

//String to double
String s2="100.5";
double d1=Double.parseDouble(s2);
System.out.println(s2+100.5);//Concat
System.out.println(d1+100.5);//add

//String to char
String s3="sandy";
char c1=s3.charAt(3);
System.out.println(c1);
	}

}
