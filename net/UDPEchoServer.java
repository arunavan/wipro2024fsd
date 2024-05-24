import java.net.*;
import java.io.*;

public class UDPEchoServer extends UDPServer {

  static { defaultPort = 7; }

  public static void respond(DatagramSocket ds, DatagramPacket dp) {

    DatagramPacket outgoing;
    
    try {
      outgoing = new DatagramPacket(dp.getData(), dp.getLength(), 
                                    dp.getAddress(), dp.getPort());
      ds.send(outgoing);
    }
    catch (IOException e) {
      System.err.println(e);
    }
    
  }

}
