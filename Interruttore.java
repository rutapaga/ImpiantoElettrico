/*Progettare una classe Interruttore che rappresenta un
        interruttore per la lampadina fatta precedentemente
        • Ogni interruttore è collegato ad una lampadina e ne regola
        accensione e spegnimento
        • Definite quali campi, metodi e costruttori siano opportuni
        • Creare un metodo di test che istanzia due interruttori e li
        collega alla stessa lampadina e poi offre all’utente
        ripetutamente la possibilità di clickare uno dei due interruttori
        oppure di terminare l’esecuzione*/

public class Interruttore {

    //attributi
    private Lampadina lamp;

    //costruttori
    public Interruttore(Lampadina lamp) {
        this.lamp=lamp;
    }

    //metodi
    public void premi () {
        this.lamp.click();
    }

}
