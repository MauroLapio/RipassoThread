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
        Numero = Storage.getiNumero();//Chiamata che prende il numero da storage
        try
        {
            Storage.s.acquire();
            System.out.println("Output numero: " + Numero);//Print del numero
            Storage.s.release();
        }
        catch(Exception e)
        {
            System.out.println("Errore: "+ e);
        }
    }
}
