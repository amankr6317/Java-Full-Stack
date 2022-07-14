public class ThreadGetStateDemo extends Thread 
{  
   public void run()   
    {  
         
        Thread.State state = Thread.currentThread().getState();  
        System.out.println("Running thread name: "+ Thread.currentThread().getName());  
        System.out.println("State of thread: " + state);  
    }  
    public static void main(String args[])   
    {  
    	ThreadGetStateDemo t1 = new ThreadGetStateDemo();  
    	ThreadGetStateDemo t2 = new ThreadGetStateDemo();
        
        t1.start();     
        t2.start();  
    }  
}  