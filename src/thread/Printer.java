package thread;

public class Printer implements Runnable
{
    public int Numero;
    
    public Printer()
    {
        //Costruttore vuoto
    }
    
    @Override
    public void run()//Classe run che legge la variabile in Storage
    {
        int i;//Inizializzazione variabile contatore
        
        for(i=0; i<50; i++)//Ciclo per mettere a video il risultato
        {
           Numero = Storage.getiNumero();//Chiamata che prende il numero da storage
           System.out.println("Numero: " + Numero);//Print del numero
        }
    }
}
