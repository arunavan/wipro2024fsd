import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {
	URL yahoo = new URL("http://www.google.co.in/");
	BufferedReader in = new BufferedReader(
				new InputStreamReader(
				yahoo.openStream()));

	String inputLine;

	while ((inputLine = in.readLine()) != null)
	    System.out.println(inputLine);

	in.close();
    }
}
