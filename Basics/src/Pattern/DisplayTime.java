package Pattern;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=10;
for(int j=30;j<=59;j++)
{
	System.out.println(i+":"+j);
}
i=11;
for(int j=0;j<=30;j++)
	
{
	if(j<=9)
	{
		System.out.println(i+":0"+j);
	}
	else
	{
		System.out.println(i+":"+j);
	}
}
}

}
