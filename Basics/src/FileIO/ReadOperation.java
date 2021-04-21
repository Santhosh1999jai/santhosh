package FileIO;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.SynchronousQueue;

public class ReadOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	FileReader fr=new FileReader("D:/india.txt");
	int i;
	while( (i=fr.read()) != -1)
{
	System.out.print((char)i);
}
	fr.close();
}
catch(IOException e)
{
	System.out.println(e);
}
	}

}
