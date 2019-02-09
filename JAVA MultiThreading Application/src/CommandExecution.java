import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandExecution implements Runnable {
	   private Thread t;
	   private String threadName;
	   
	   CommandExecution( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );
	      Process process=null;
          try
          { 
          
          process = Runtime.getRuntime().exec(Lab201.textField.getText()); //for Windows
          
          process.waitFor();
          BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
          String line;
          Lab201.textAreaCMDOut.setText("");;
             while ((line=reader.readLine())!=null)
             {
              System.out.println(line);
              
              Lab201.textAreaCMDOut.append(line+"\n");
              
              }
           }       
           catch(Exception e)
           { 
               System.out.println(e); 
           }
           finally
           {
             process.destroy();
           }
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}
