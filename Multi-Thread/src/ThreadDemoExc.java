
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kevinsteppe on 2/10/15.
 */
public class ThreadDemoExc
{
    public static final int numLoops = 8;
    private static int num_threads = 4;


    public static void main(String[] args) throws Exception
    {
        Thread t1 = new Thread(new ThreadDemo(0));
        Thread t2 = new Thread(new ThreadDemo(1));
        Thread t3 = new Thread(new ThreadDemo(2));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join(); //wait for all
        System.out.println("===== end loop =====");
    }
}

class ThreadDemo implements Runnable
{
    int id;
    Random random = new Random();

    public ThreadDemo(int i)
    {
        id = i;
    }

    public void run()
    {
        try
        {
            for (int i = 0; i < 10; i++)
            {

                System.out.print("Hello World " + id);
                System.out.println();

                Thread.yield();
                int x = random.nextInt(4);
                if (x == id)
                {
                    throw new Exception("An exception! " + id);
                }

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
