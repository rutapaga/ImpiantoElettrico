public class mainContatore {
    public static void main(String[] args) {
        Contatore c = new Contatore();
        System.out.println(c.conteggio);
        Contatore cont = new Contatore(3);
        System.out.println(cont.conteggio);
        c.incrementa();
        cont.incrementa();
        System.out.println(c.conteggio);
        System.out.println((cont.conteggio));
        c.reset();
        cont.reset(10);
        System.out.println(c.conteggio);
        System.out.println((cont.conteggio));
        System.out.println(c.getConteggio());

    }
}
