package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	FileWriter fw= new FileWriter("D:/abc.txt");
	String s="india \t is my country";
	fw.write(s);
	fw.flush();
	fw.close();
}
catch(IOException e)
{
	System.out.println(e);
}
	}

}
