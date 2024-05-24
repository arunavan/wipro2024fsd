import java.io.*;
public class LineNumberReaderExample{
  public static void main(String[] args) throws Exception{
  File file = null;
  FileReader freader = null;
  LineNumberReader lnreader = null;
  try{
  file = new File("LineNumberReaderExample.java");
  freader = new FileReader(file);
  lnreader = new LineNumberReader(freader);
  String line = "";
  while ((line = lnreader.readLine()) != null){
  System.out.println("Line:  " + lnreader.
getLineNumber() + ": " + line);
  }
  }
  finally{
  freader.close();
  lnreader.close();
  }
  }
}