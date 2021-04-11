package roughprogram;

public class CountTheDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=6078;
int count=0;
while(num!=0)
{
	count=count+1;
	num=num/10;
}
System.out.println(count);
	}

}
