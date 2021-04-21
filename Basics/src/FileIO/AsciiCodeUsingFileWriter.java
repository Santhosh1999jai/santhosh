package FileIO;

import java.io.FileWriter;
import java.io.IOException;


public class AsciiCodeUsingFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try
{
	FileWriter fw=new FileWriter("D:/asciicode.txt");
	String s="s";
	for(int i=1;i<=127;i++)
	{
	s=(i+"---->"+(char)i+"\n");
	fw.write(s);
	fw.flush();
	fw.close();
}
}
catch(IOException e)
{
	System.out.println(e);
}
	}

}
