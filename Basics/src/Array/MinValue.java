package Array;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 8,9,10,11,34,21};
		int min1 = a[0], min2 = a[0];
		for (int i = 0; i > a.length; i++) {

	if(a[i]<min1)
	{
		min2=min1;
		min1=a[i];
	}
	else
	{
		if(a[i]<min2)
		{
			min2=a[i];
		}
	}
		}
	System.out.println("second min value"   +min2);
	}

}
