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
        Thread threadc2 = new Thread(c, "c2");
        Thread threadc3 = new Thread(c, "c3");
        
        Thread threadp1 = new Thread(p, "p1");
        Thread threadp2 = new Thread(p, "p2");
        Thread threadp3 = new Thread(p, "p3");
        
        try
        {
            threadc1.start();
            threadc2.start();
            threadc3.start();
            
            threadp1.start();
            threadp2.start();
            threadp3.start();
        }
        catch (Exception e)
        {
            System.out.println("Errore: " + e);
        }
    }
}
