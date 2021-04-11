package Array;

public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int x[]={4,7,9,10};
		int y[]={1,5,9,8,11,15};
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

		if(x[i]==y[i])
		{
			y[i]=0;
			System.out.println(y[i]);
		}
					
	}
}}
