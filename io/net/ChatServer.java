//Chat Server
import java.net.*;
import java.io.*;

public class ChatServer
{
	public static void main(String args[]) throws Exception
	{
		//create server side socket
		ServerSocket ss = new ServerSocket(8888);

		//Connect it to client socket
		Socket s = ss.accept();
		System.out.println("Connection Established");
		
		//to write data to client socket
		PrintStream ps = new PrintStream(s.getOutputStream());
		
		//to read data coming from client
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//to read data from the keyboard
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) //server executes continuously
		{
			String str,str1;

			while((str = br.readLine())!=null)
			{
				//display data coming from client
				System.out.println(str);
				
				//accept data from keyboard
				str1 = kb.readLine();

				//send it to client
				ps.println("SERVER:"+str1);
			}
			
			//close connection and exit
			ps.close();
			br.close();
			kb.close();
			ss.close();
			s.close();
			
			System.exit(0);
		}//end of while
	}//end of main()
}//end of ChatServer