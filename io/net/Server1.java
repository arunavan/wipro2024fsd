import java.io.*;
import java.net.*;

public class Server1
{
	public static void main(String args[])throws Exception
	{
		ServerSocket ss = new ServerSocket(777);
		
		Socket s = ss.accept();
		
		System.out.println("-------connection established--------");
		
		OutputStream obj = s.getOutputStream();
		
		PrintStream ps = new PrintStream(obj);
		
		String str = "Hello Naveen...";

		ps.println(str);
		
		ps.println("Bye");

		ps.close();
		ss.close();
		s.close();
	}
}