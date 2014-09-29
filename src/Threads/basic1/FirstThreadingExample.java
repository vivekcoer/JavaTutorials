package Threads.basic1;

class FirstThreadingExample {
	   public static void main (String [] args) {
	    // The second argument is a delay between
	    //   successive outputs.  The delay is
	    //   measured in milliseconds.  "10", for
	    //   instance, means, "print a line every
	    //   hundredth of a second".
	      ExampleThread mt = new ExampleThread("A", 31);
	      ExampleThread mt2 = new ExampleThread("B", 25);
	      ExampleThread mt3 = new ExampleThread("C", 10);
	      mt.start();
	      mt2.start();
	      mt3.start();
	   }
	}

	class ExampleThread extends Thread {
	   private int delay;
	   public ExampleThread(String label, int d) {
	         // Give this particular thread a 
	         //   name:  "thread 'LABEL'".
	      super("thread '" + label + "'");
	      delay = d;
	   }
	   public void run () {
		   synchronized (this) {	   
		  
			      for (int count = 1, row = 1; row < 5; row++, count++) {
			         //try {
			            System.out.format("Line #%d from %s\n",
			                                             count, getName());
			            //Thread.currentThread().sleep(delay);
			        // }
			//	         catch (InterruptedException ie) {
			//	            // This would be a surprise.
			//	         }
			      }
		   }
		   
	   }
	}

