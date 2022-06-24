public class Contatore {

    public int conteggio;

    // costruttori
    public Contatore () {
        this.conteggio = 0;
    }
    public Contatore(int conteggio) {
        this.conteggio=conteggio;
    }

    // metodi
    public void incrementa () {
        this.conteggio++; //
    }

    public int getConteggio () {
        return conteggio;
    }

    public void reset() {
        this.conteggio = 0;
    }

    public void reset( int a) {
        this.conteggio = a;
    }
}