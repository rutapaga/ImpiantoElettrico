public class Impianto {
    //attributi
    private static boolean corrente;

    //costruttore
    public Impianto() {
        this.corrente=true;
    }

    public Impianto( boolean corrente) {
        this.corrente=corrente;
    }
    //metodi
    public void attivaImpianto() {
        this.corrente=true;
    }

    public void disattivaImpianto() {
        this.corrente=false;
    }

    public boolean getImpianto() {
        return this.corrente;
    }
}
