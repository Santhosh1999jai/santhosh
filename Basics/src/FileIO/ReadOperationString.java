package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadOperationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s="";
				try
		{
			FileReader fr=new FileReader("D:/india.txt");

			int i;
			while( (i=fr.read()) != -1)
		{
			s=s+(char)i;
		}
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.print(s);
			}
}
