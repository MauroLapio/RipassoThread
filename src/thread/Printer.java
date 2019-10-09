package thread;

public class Printer implements Runnable
{
    public int Numero;
    
    public Printer()
    {
        //Costruttore vuoto
    }
    
    @Override
    synchronized public void run()//Classe run che legge la variabile in Storage
    {
        int i;//Inizializzazione variabile contatore
        
        for(i=0;i<50;i++)
        {
            try
            {
                Storage.s2.acquire();
                Numero = Storage.getiNumero();//Chiamata che prende il numero da storage
                System.out.println("Output numero " + (i+1) + ": " + Numero);//Print del numero
                Storage.s1.release();
            }
            catch(Exception e)
            {
                System.out.println("Errore: "+ e);
            }
        }
    }
}
