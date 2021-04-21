package FileIO;

public class performanceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		StringBuilder Sb = new StringBuilder("java");
for(int i=1;i<=100000;i++)
{
			Sb.append("programming");
}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + "ms");
	}

}
