package thread;

public class Printer implements Runnable
{
    public int Indice;
    
    Printer()
    {
        //Costruttore vuoto
    }
    
    @Override
    public void run()//Classe run che legge la variabile in Storage
    {
       Indice = Storage.getiIndice(); 
       System.out.println("Indice: " + Indice);
    }
}
