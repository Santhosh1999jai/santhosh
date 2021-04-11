package Recursion;

public class Fibonacci {
int a=0,b=1;
void m(int i)
{
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	i++;
	if(i<=10)
	{
		m(i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println(0+"\n"+1);
			Fibonacci obj=new Fibonacci();
					obj.m(1);
		}
	}

}
