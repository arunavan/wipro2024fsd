//To print Domain Name and IP address of Local System
import java.net.*;

public class LocalHost
{
	public static void main(String s[]) throws UnknownHostException
	{
		System.out.println(InetAddress.getLocalHost());
	}
}