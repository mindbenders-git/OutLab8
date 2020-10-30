import java.text.SimpleDateFormat;
import java.util.*;

public class q4 implements Runnable {

    @Override
    public void run() {
    	Date date = new Date();
	    SimpleDateFormat clock = new SimpleDateFormat("HH:mm:ss");
	    System.out.println(clock.format(date));
    }

    public static void main(String args[]){
    	Runnable runnable = new q4();
        while(true)
        {
            Thread thread = new Thread(runnable);  
            thread.start(); 
	        try 
            {
	            Thread.sleep(1000);
	        } 
            catch (InterruptedException e) 
            {
	            e.printStackTrace();
	        }
	    }
    }

}

//###################################################################
//ref :- https://www.journaldev.com/1050/java-timer-timertask-example
