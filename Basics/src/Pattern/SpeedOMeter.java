package Pattern;

public class SpeedOMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=9999;i++)
{
	if(i<=9)
	{
		System.out.print("000");
	}
	if(i>=10&&i<=99)
	{
		System.out.print("00");
	}
	if(i>=100&&i<=999)
	{
		System.out.print("0");
	}
	System.out.println(i);
}
	}

}
