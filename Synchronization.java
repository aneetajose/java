class multiply
{
    void call(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + num + "=" + (i * num));
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
class table extends Thread
{
    int n;
    multiply mul;
    Thread t;
    table(multiply m,int num)
    {
        mul=m;
        n=num;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        synchronized (mul)
        {
            mul.call(n);
        }
    }
}
public class Synchronization
{
    public static void main(String[] args)
    {
        multiply mul=new multiply();
        table t1=new table(mul,2);
        table t2=new table(mul,3);
        table t3=new table(mul,4);
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

