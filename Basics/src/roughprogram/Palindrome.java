package roughprogram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=171;
int copy=num;
int rev=0;
while(num!=0)
{
	rev=rev*10+num%10;
num=num/10;
}
	System.out.println(rev);

	
	if(copy==rev)
	{
		System.out.println("palidrome");
	}
	else
	{
		System.out.println("nonpalindrome");	
	}
	}
}