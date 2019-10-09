package thread;

public class Counter implements Runnable
{
    public Counter()
    {
        
    }
    
    @Override
    public void run()
    {
        int n; //numero da incrementare
        
        n = Storage.getn(); //acquisisco il numero da incrementare
        
        n++; //incremento il numero
        
        Storage.setn(n); //imposto il numero nello storage
    }
}
