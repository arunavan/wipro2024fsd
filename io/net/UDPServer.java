import java.net.*;
import java.io.*;

public class UDPServer {

  protected static int defaultPort = 0;
  protected static int defaultBufferLength = 65507;

  public static void main(String[] args) {
  
    DatagramPacket incoming;

    int port;
    int len;
    
    try {
      port = Integer.parseInt(args[0]);
    }
    catch (Exception e) {
      port = defaultPort;
    }
    try {
      len = Integer.parseInt(args[1]);
    }
    catch (Exception e) {
      len = defaultBufferLength;
    }

    try {
      DatagramSocket ds = new DatagramSocket(port);
      byte[] buffer = new byte[len];
      while (true) {
        incoming = new DatagramPacket(buffer, buffer.length);
        try {
          ds.receive(incoming);
          respond(ds, incoming);
        }
        catch (IOException e) {
          System.err.println(e);
        }      
      } // end while
    }  // end try
    catch (SocketException se) {
      System.err.println(se);
    }  // end catch

  }  // end main
  
  public static void respond(DatagramSocket ds, DatagramPacket dp) {
    ;
  }

}
