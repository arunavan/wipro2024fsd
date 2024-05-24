/* In the book this example extends Applet.  I decided it 
made more sense to extend Frame directly.  */


import java.applet.*;
import java.awt.*;
import java.net.*;
import java.io.*;


public class URLRequestor extends Frame {

  TextField url;
  TextArea textDisplay;

  public static void main(String[] args) {
  
    URLRequestor a = new URLRequestor();  
    a.show();

  }
  
  public URLRequestor() {
  
    super("URL Requestor");
    resize(500,300);
    move(50,50);
    init();

  }

  public void init() {
  
    textDisplay = new TextArea();
    add("Center", textDisplay);
    // We don't want the buttons and fields in the north and south
    // to fill their respertive sections so we'll add Panels there
    // and use FlowLayout's in the Panels
    Panel SouthPanel = new Panel();
    Panel NorthPanel = new Panel();
    NorthPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    SouthPanel.add(new Button("Get URL"));
    NorthPanel.add("North", new Label("URL: "));
    url = new TextField(40);
    NorthPanel.add("North", url);
    add("South", SouthPanel);
    add("North", NorthPanel);
      
  }
  
  public boolean action(Event e, Object o) {
  
    if (e.target instanceof Button) {
      fetchURL(url.getText());
      return true;
    }
    else if (e.target == url) {
      fetchURL(url.getText());
      return true;
    }
    else {
      return false;
    }
  
  }
  
 public void fetchURL(String s) {
 
   try {
     URL u = new URL(s);
     try {
       Object o = u.getContent();
       if (o instanceof InputStream)  {
         showText((InputStream) o);
       }
       else {
         showText(o.toString());
       }
     }
     catch (IOException e) {
       showText("Could not connect to " + u.getHost());
     }
     catch (NullPointerException e) {
       showText("There was a problem with the content");
     }
   }
   catch (MalformedURLException e) {
     showText(url.getText() + " is not a valid URL");
   }
 
 }
 
 void showText(String s) {
   textDisplay.setText(s);
 }
 
 void showText(InputStream is) {
 
   String nextline;
 
   textDisplay.setText("");
   try {
     DataInputStream dis = new DataInputStream(is);
     while((nextline = dis.readLine()) != null) {
       textDisplay.appendText(nextline + "\n");
     }
   }
   catch (IOException e) {
     textDisplay.appendText(e.toString());
   }
   
 }
 
}
