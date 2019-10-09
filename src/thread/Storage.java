package thread;

import java.util.concurrent.Semaphore;

public class Storage 
{
    public static int iNumero = 0; // Variabile condivisa
    public static Semaphore s1 = new Semaphore(1);
    public static Semaphore s2 = new Semaphore(0);
    
    public Storage() // Costruttore vuoto
    {
       
    }
    public static int getiNumero() // Metodo che ritorna il contenuto della variabile
    {
        return iNumero;
    }
    public static void setiNumero(int iNumero) // Metodo che ottiene il valore dal Counter e lo imposta come variabile
    {
        Storage.iNumero=iNumero;
    }
}
