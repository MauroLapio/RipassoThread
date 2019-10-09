package thread;
public class Storage 
{
    public int iIndice; // Variabile condivisa
    
    public int getiIndice() // Metodo che ritorna il contenuto della variabile
    {
        return iIndice;
    }
    public void setiIndice(int iIndice) // Metodo che ottiene il valore dal Counter e lo imposta come variabile
    {
        this.iIndice=iIndice;
    }
    
}
