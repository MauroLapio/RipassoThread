package thread;

public class Printer implements Runnable
{
    Storage stg = new Storage();
    public int Indice;
    
    Printer(Storage stg)//Inizializzazione stg
    {
        this.stg = stg;
    }
    
    @Override
    public void run()//Classe run che legge la variabile in Storage
    {
       Indice = stg.getiIndice(); 
       System.out.println("Indice: " + Indice);
    }
}
