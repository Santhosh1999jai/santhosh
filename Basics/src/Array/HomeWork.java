package Array;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={7,8,1,3};
		int y[]={11,13,7,19,12};
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
				{
					z[i]=x[i];
							System.out.println(z[i]);
				}
		for(int i=0;i<y.length;i++)
		{
			z[x.length+i]=y[i];
			System.out.println(z[x.length+i]);
	}
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<y.length;i++)
		if(x[i]>y[i])
		{
			int temp=x[i];
			x[i]=y[i];
			y[i]=temp;
		}
			{
			System.out.println(x[i]);
			
		}

}}}
