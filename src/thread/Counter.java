package thread;

public class Counter implements Runnable
{
    public Counter()
    {}
    
    @Override
    public void run()
    {
        int iNumero; //numero da incrementare
        int i;
        
        for(i=0; i<50; i++)
        {
            iNumero = Storage.getiNumero(); //acquisisco il numero da incrementare

            iNumero++; //incremento il numero

            Storage.setiNumero(iNumero); //imposto il numero nello storage
        }
    }
}
