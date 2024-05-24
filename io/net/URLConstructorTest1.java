import java.net.*;


public class URLConstructorTest1 {

 
 public static void main (String args[]) {

  
  URL webURL, ftpURL;

  
  try {
  
    webURL = new URL("http://xsx.msdfsdfsdfdacfaq.com/vendor.html");
     
 System.out.println(webURL);
 
     ftpURL = new URL("ftp://ftp.macfaq.com/pub/");
 
     System.out.println(ftpURL);
    }
  
  catch (MalformedURLException e) 
 {
 
     System.err.println(e);
   
 }

 
 }


} 
