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
        
        for(i=0;i<500;i++)
        {
            try
            {
                Storage.s1.acquire();
                iNumero = Storage.getiNumero(); //acquisisco il numero da incrementare
                iNumero++; //incremento il numero
                Storage.setiNumero(iNumero); //imposto il numero nello storage
                Storage.s2.release();
            }
            catch(Exception e)
            {
                System.out.println("Errore: "+ e);
            }
        }
    }
}
