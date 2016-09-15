
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kevinsteppe on 2/10/15.
 */
public class FileTest
{
    public static final int numLoops = 200;
    public static final int numComputations = 3000;
    public static final String fileA = "fileA.txt";
    public static final String fileB = "fileB.txt";

    public static void main (String[] args) throws Exception
    {

        Thread t1 = new Thread(new FileA());
        Thread t2 = new Thread(new FileB());

        final long startTime = System.currentTimeMillis();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime) );
    }

    protected static void complicatedComputation(int i)
    {
        BigInteger j = new BigInteger("2");

        for (int z = 2; z < FileTest.numComputations; z++){
            j = j.multiply(new BigInteger(String.valueOf(i)));
        }
    }
}

class FileA implements Runnable
{
    public void run (){
        PrintWriter writer = null;

        try
        {
            for (int i = 0; i < FileTest.numLoops / 5; i++)
            {
                for ( int j = 0; j < 5; j++ )
                {
                    writer = new PrintWriter(new BufferedWriter(new FileWriter(FileTest.fileA, true)));
                    FileTest.complicatedComputation(i);
                    writer.println("The first file" + j);
                    writer.close();
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}

class FileB implements Runnable
{
    public void run (){

        PrintWriter writer = null;

        try
        {
            for (int i = 0; i < FileTest.numLoops / 5; i++)
            {
                for ( int j = 0; j < 5; j++ )
                {
                    writer = new PrintWriter(new BufferedWriter(new FileWriter(FileTest.fileA, true)));
                    FileTest.complicatedComputation(i);
                    writer.println("The second file" + j);
                    writer.close();
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
