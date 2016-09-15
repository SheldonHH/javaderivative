
import java.util.concurrent.locks.Lock;

/**
2 threads, both print 10 characters per line for 10 lines.  ex: Thread 1 prints:

..........
..........
..........
..........
..........
..........
..........
..........
..........
..........

Thread 1 prints does.  Thread 2 prints crosses.
Use locking to ensure that they aren't mixed together.

 */
public class ThreadDemoSOP
{
    public void go() throws Exception
    {
        //Run the multithreaded demo 10 times
        for (int i = 0; i < 10; i++)
        {
            Thread t1 = new Thread(new ThreadDemo(".")); // this thread prints dots
            t1.start();
            t1.join();

            Thread t2 = new Thread(new ThreadDemo("X")); // this thread prints crosses
            t2.start();

            t2.join(); //wait for both to finish
            System.out.println("===== end loop =====");
        }
    }

    public static void main (String[] args) throws Exception

    {
        ThreadDemoSOP t = new ThreadDemoSOP();
        t.go();
    }

    class ThreadDemo implements Runnable
    {
        private String toPrint; // string that this thread pritns

        public ThreadDemo(String toPrint)
        {
            this.toPrint = toPrint;
        }

        public void run ()  {
            Lock lock1 = LockFactory.getLock("Print the results");

            for (int row = 0; row < 10; row++)
            {  lock1.lock();



                for (int col = 0; col < 10; col++)
                {
                    System.out.print(toPrint); //"."  or  "X"
                }
                System.out.println();
                lock1.unlock();
               Thread.yield();
                try{Thread.sleep(500);}catch(Exception e){}
            }
        }


    }
}
