package thread;

public class Printer implements Runnable
{
    public int Numero;
    
    Printer()
    {
        //Costruttore vuoto
    }
    
    @Override
    public void run()//Classe run che legge la variabile in Storage
    {      
       int i;
        
        for(i=0; i<50; i++)
        {
           Numero = Storage.getiNumero();
           System.out.println("Numero: " + Numero);
        }
    }
}
