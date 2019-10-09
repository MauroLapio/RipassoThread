package thread;
public class Storage 
{
    public static int iNumero = 0; // Variabile condivisa
    
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
