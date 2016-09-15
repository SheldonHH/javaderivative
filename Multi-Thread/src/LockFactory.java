

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockFactory
{
    private static final ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
    private static final Lock internalLock = new ReentrantLock();

    public static Lock getLock(String lockName)
    {
        try
        {
            internalLock.lock();
            Lock lock = (Lock) get(lockName, 0);

            return lock;
        }
        finally
        {
            internalLock.unlock();
        }
    }

    public static ReadWriteLock getReadWriteLock(String lockName)
    {
        try
        {
            internalLock.lock();
            ReadWriteLock lock = (ReadWriteLock) get(lockName, 1);
//            lock.r
            return lock;
        }
        finally
        {
            internalLock.unlock();
        }
    }

    private static Object get(String lockName, int type)
    {
        Object l = map.get(lockName);
        if (l == null)
        {
            switch (type)
            {
                case 0:
                    l = new ReentrantLock();
                    break;
                case 1:
                    l = new ReentrantReadWriteLock();
                    break;
            }
            map.put(lockName, l);
        }

        return l;
    }

    public static void main(String[] args)
    {
        //Test the Factory
        ReentrantLock reentrantLock = (ReentrantLock) LockFactory.getLock("RL a");
        assert(reentrantLock != null);

        Lock lock = LockFactory.getLock("RL b");
        assert(lock != null);

        ReadWriteLock rwLock = LockFactory.getReadWriteLock("RWL a");
        assert(rwLock != null);

//        ReadWriteLock failLock = LockFactory.getLock("Wrong type");

    }
}
