package string;

public class PrimeNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10000;
int count=0;
for(int i=1;i<=num;i++)
{
	if(num%i==0)
	{
		count=count+1;
	}
}
System.out.println(num);
System.out.print("count"+count);
if(count==2)
{
	System.out.print("prime number");
	
}
else
{
	System.out.print("not a prime number");
}
	}

}
