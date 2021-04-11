package Array;

public class Merge3ArrayInOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={5,8,9,3};
int b[]={14,15,2,18,22};
int c[]={56,34,73,1,10,20};
int z[]=new int[a.length+b.length+c.length];
for(int i=0;i<a.length;i++)
{
	z[i]=a[i];
	System.out.println(z[i]);
}
for(int i=0;i<b.length;i++)
{
	z[a.length+i]=b[i];
	System.out.println(z[a.length+i]);
}
for(int i=0;i<c.length;i++)
{
	z[a.length+b.length+i]=c[i];
	System.out.println(z[a.length+b.length+i]);
}
	}

}
