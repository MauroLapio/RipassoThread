package thread;

public class Counter implements Runnable
{
    public Counter()
    {}
    
    @Override
    synchronized public void run()
    {
        int iNumero; //numero da incrementare
        int i;
        
        try
        {
            Storage.s.acquire();
            iNumero = Storage.getiNumero(); //acquisisco il numero da incrementare
            iNumero++; //incremento il numero
            Storage.setiNumero(iNumero); //imposto il numero nello storage
            Storage.s.release();
        }
        catch(Exception e)
        {
            System.out.println("Errore: "+ e);
        }
    }
}
