package encryption;

public class LowLevelEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "secret code is FAFBCD";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			c[i] = (char) (c[i] + 1);
			System.out.print(c[i]);
		}
		System.out.println();
	
for(int i=0;i<c.length;i++)
{
	c[i] = (char) (c[i] - 1);
	System.out.print(c[i]);
}
	}
	}


