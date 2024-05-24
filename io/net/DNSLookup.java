//Demonstrate the usage of InetAddress class
import java.net.*;

public class DNSLookup
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress host;
		
		byte[] addressBytes;

		int[] addressComponents = new int[4];
		
		if(args.length == 0)
		{
			host = InetAddress.getLocalHost();
		}
		else
		{
			host = InetAddress.getByName(args[0]);
		}
	
		System.out.print("Host"+host.getHostName()+"has address:");
		
		addressBytes = host.getAddress();
		
		for(int i = 0;i<4;i++)
			addressComponents[i] = addressBytes[i]&255;

		System.out.println(addressComponents[0]+" "+addressComponents[1]+" "+addressComponents[2]+" "+addressComponents[3]);
	}
}