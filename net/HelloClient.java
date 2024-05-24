import java.net.*;
import java.io.*;

public class HelloClient
{
	public static void main(String args[])throws Exception
	{
		Socket s = new Socket("localhost", 5000);

		String str1 = "Hello Server, How do you do";
		
		OutputStream ostream = s.getOutputStream();
		
		DataOutputStream dos = new DataOutputStream(ostream);
		
		dos.writeBytes(str1);

		dos.close();
		ostream.close();
		s.close();
	}
}