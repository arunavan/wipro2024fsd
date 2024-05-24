import java.net.*;
import java.io.*;

/**
 * This class allows you to send and receive Strings and byte arrays via UDP
 * without concerning yourself with DatagramPackets and DatagramSockets.
 * @version 1.0 of June 1, 1996 
 * @author Elliotte Rusty Harold 
 */
public class UDPClient {

  InetAddress ia;
  int port;
  DatagramSocket ds;

  /**
   * Creates a new UDPClient.
   * @param ia The InetAddress of the remote host to which data will be sent
   * @param port The port on the remote host to which data will be sent
   * @throws SocketException
   */
   public UDPClient(InetAddress ia, int port) throws SocketException {
  
    this.ia = ia;
    this.port = port;
    ds = new DatagramSocket();
  
  }

  public UDPClient(String hostname, int port) throws UnknownHostException, SocketException {
  
    this(InetAddress.getByName(hostname), port);
  
  }
  
  /**
   * This method sends data to the remote host via UDP. If the byte is longer than
   * the maximum reliable length of a UDP Datagram (64900) bytes then an 
   * IOException is thrown
   * @param buffer A byte array containing the data to be sent
   * @throws IOException
   */
  public void send(byte[] buffer) throws IOException {
  
    if (buffer.length > 64900) throw new IOException();
    DatagramPacket dp = new DatagramPacket(buffer, buffer.length, ia, port);
    ds.send(dp);
    
  }

  /**
   * This method sends an ISO-Latin-1 string to the remote host via UDP.
   * The string will be truncated to ISO-Latin-1 even if it's Unicode.
   * @param s The string to be sent
   * @throws IOException
   */   
  public void send(String s) throws IOException {
  
    byte[] data = new byte[s.length()];
    s.getBytes(0, s.length(), data, 0);
    send(data);
  
  }
  
  /**
   * This method sends an empty datagram to the remote host via UDP.
   * @throws IOException
   */  
  public void send() throws IOException {
  
    byte[] b = new byte[1];
    send(b);
  
  }
    
  /** 
   * This method blocks until a UDP Datagram is received from the host with which
   * this UDPClient communicates. This can be an indefinite amount of time if
   * the host is unreachable so calls to this method should be placed in a separate
   * thread from the main program.
   * @return the data received as a byte array
   * @throws IOException
   */
  public synchronized byte[] receive() throws IOException {
  
    byte[] buffer = new byte[65507];
    DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
    ds.receive(incoming);
    // a client should only receive data from the host to 
    while ( !incoming.getAddress().equals(ia)) {
      ds.receive(incoming);
    } 
    return incoming.getData();
  
  }
  
  /** 
   * This method blocks until a UDP Datagram is received from the host with which
   * this UDPClient communicates. This can be an indefinite amount of time if
   * the host is unreachable so calls to this method should be placed in a separate
   * thread from the main program. When data is received it is
   * converted into an ISO-latin-1 String and returned.
   * @return the data received as a byte array
   * @throws IOException
   */
  public synchronized String receiveString() throws IOException {
  
    byte[] data = receive();
    return new String(data, 0, 0, data.length);
  
  }
    
  /** 
   * @return the port which this object sends data to
   */
  public int getPort() {
  
    return port;
  
  }

  /** 
   * @return the port which this client is bound to 
   */
  public int getLocalPort() {
  
    return ds.getLocalPort();
  
  }
  
  /** 
   * @return the InetAddress which this client sends data to 
   */
  public InetAddress getAddress() {
  
    return ia;
  
  }
  
  /** 
   * @return a String showning the remote host and port which this client sends data to 
   */
  public String toString() {
  
    return ia + ":" + port;
  
  }

}
