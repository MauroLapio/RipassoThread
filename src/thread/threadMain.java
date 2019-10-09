package thread;

public class threadMain
{
    public threadMain()
    {
        //costruttore vuoto
    }
    
    public static void main(String[] args)
    {
        Storage s = new Storage();
        Counter c = new Counter();
        Printer p = new Printer();
        
        Thread threadc1 = new Thread(c, "c1");
        Thread threadp1 = new Thread(p, "p1");
        
        try
        {
            threadc1.start();
            threadp1.start();
        }
        catch (Exception e)
        {
            System.out.println("Errore: " + e);
        }
        
        threadc1.interrupt();
    }
}
