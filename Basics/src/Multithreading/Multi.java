package Multithreading;

class A extends Thread
{
	public void run()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}

		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
			
			System.out.println();
			}

		}
	
	
}


class B  extends Thread
{
	public void run()
	{
		int a=5;
		for(int i=1;i<=a;i++)
		{
			if(i==3)
			{
				stop();
			}
			System.out.println("*  ");
		}
		
	}
}




class C  extends Thread
{
	public void run()
	{
		int a=5;
		int b=9;
		for(int i=1;i<=a;i++)
		{
		
			for(int j=1;j<=b;j++)
			{
			System.out.print("*"+"  ");
		}
	
		System.out.println();
		}
		
	}
	
	
	
}

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		C c=new C();
		a.start();
		b.start();
		c.start();

	}

}
