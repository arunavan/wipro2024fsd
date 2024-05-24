import java.net.*;

public class UDPSender {

  
public static void main(String args[]) {
  

    String s = "This is a test.";
  
 
   byte[] data = new byte[s.length()];
  
  s.getBytes(0, s.length(), data, 0);
   
 try {
      InetAddress ia = InetAddress.getByName("sunsite.unc.edu");
    
  int port = 7;
     
 DatagramPacket dp = new DatagramPacket(data, data.length, ia, port);
    }
    catch (UnknownHostException e) 
{
    }
   
 
  }

}
