import java.net.*;
import java.io.*;
 
public class DownloadFile
{
  public static void main(String[] args)
  {
     try
     {
        /*
         * Get a connection to the URL and start up
         * a buffered reader.
         */
        long startTime = System.currentTimeMillis();
 
        System.out.println("Connecting to Mura site...\n");
 
        URL url = new URL("https://soundcloud.com/djbl3nd/berserk-exodus-jason-risk-lj");
        url.openConnection();
        InputStream reader = url.openStream();
 
        /*
         * Setup a buffered file writer to write
         * out what we read from the website.
         */
        FileOutputStream writer = new FileOutputStream(new File("test.mp3"));
        byte[] buffer = new byte[4096];
        int totalBytesRead = 0;
        int bytesRead = 0;
 
        System.out.println("Reading ZIP file 150KB blocks at a time.\n");
 
        while ((bytesRead = reader.read(buffer)) > 0)
        {  
           writer.write(buffer, 0, bytesRead);
           buffer = new byte[153600];
           totalBytesRead += bytesRead;
        }
 
        long endTime = System.currentTimeMillis();
 
        System.out.println("Done. " + (new Integer(totalBytesRead).toString()) + " bytes read (" + (new Long(endTime - startTime).toString()) + " millseconds).\n");
        writer.close();
        reader.close();
     }
     catch (MalformedURLException e)
     {
        e.printStackTrace();
     }
     catch (IOException e)
     {
        e.printStackTrace();
     }
 
  }
 
}