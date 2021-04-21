package FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="";
try {
	FileReader fr = new FileReader("D:/india.txt");
int i;
while((i=fr.read())!=-1);
{
	s=s+(char)(i);
}
System.out.print(s);
fr.close();
FileWriter fw=new FileWriter("D:/GTA San Andreas/sandy.txt");
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
