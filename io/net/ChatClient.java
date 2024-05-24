//Chat Client
import java.io.*;
import java.net.*;

public class ChatClient
{
	public static void main(String args[]) throws Exception
	{
		//create client socket
		Socket s = new Socket("localhost", 8888);

		//to write data to the server socket
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		//to read data from the server
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//to read data from the keyboard
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		String str,str1;
		
		while(!(str = kb.readLine()).equals("exit"))
		{
			//send data to server
			dos.writeBytes("CLIENT:"+str+"\n");

			//receive data from server
			str1 = br.readLine();
			System.out.println(str1);
		}
		//close connection
		dos.close();
		br.close();
		kb.close();
		s.close();
	}					//end of main()
}						//end of ChatClient