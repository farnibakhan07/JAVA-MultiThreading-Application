
public class fibonacciSeries implements Runnable {
	private Thread t;
	   private String threadName;
	   
	   fibonacciSeries( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );
	      int n , t1 = 0, t2 = 1;
	      n=Integer.parseInt(Lab201.textField.getText());
		  System.out.print("First " + n + " terms: ");
		  Lab201.textAreaCMDOut.setText("");
		  for (int i = 1; i <= n; ++i)
		  {
		      //System.out.print(t1 + " + ");
		      Lab201.textAreaCMDOut.append("+");
		      Lab201.textAreaCMDOut.append(Integer.toString(t1));

		      int sum = t1 + t2;
		      t1 = t2;
		      t2 = sum;
		  }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}
