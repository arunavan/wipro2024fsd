import java.net.*;
import java.io.*;

public class HelloServer
{
	public static void main(String args[])throws Exception
	{
		// create ss object to bind the connection
		ServerSocket ss = new ServerSocket(5000);

		// just give a message to know that server is working
		System.out.println("server is ready");
		
		// accept( ) method of ServerSocket binds the connection
		Socket s = ss.accept();
		
		// use s object of Socket class to get the message of client
		InputStream istream = s.getInputStream();
		
		DataInputStream dis = new DataInputStream(istream);
		
		String s1 = dis.readLine();
		
		System.out.println(s1);
		
		dis.close();
		istream.close();
		s.close();
		ss.close();
	}
}