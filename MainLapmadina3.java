import java.util.Scanner;

public class MainLapmadina3 {
    public static void main(String[] args) {
        boolean corrente = true;
        Impianto imp1 = new Impianto();
        Lampadina lamp1 = new Lampadina(imp1);
        Lampadina lamp2 = new Lampadina(imp1);
        Lampadina lamp3 = new Lampadina(imp1);
        System.out.println("Le lampadine si rompono dopo "+lamp1.clickMax+" click \n");

        while(lamp1.getCount()<= lamp1.clickMax){
            System.out.println("Corrente accesa premi 1 \n");
            System.out.println("Corrente spenta premi 2 \n");
            Scanner c_a = new Scanner(System.in);
            String c = c_a.nextLine();
            if (c.equals("1"))
                imp1.attivaImpianto();
            else if (c.equals("2"))
                imp1.disattivaImpianto();
            System.out.println("Lamp1 \n");
            System.out.println("Lamp2 \n");
            System.out.println("Lamp3 \n");
            Scanner l_a = new Scanner (System.in);
            String l = l_a.nextLine();
                if (l.equals("1")) {
                    lamp1.stato();
                    lamp1.click();
                    System.out.println("\n" + lamp1.getCount() + "\n");
                    lamp1.stato();
                    lamp1.getCorrente();
                }
                else if (l.equals("2")) {
                    lamp2.stato();
                    lamp2.click();
                    System.out.println("\n" + lamp2.getCount() + "\n");
                    lamp2.stato();
                    lamp2.getCorrente();
                }

                else if (l.equals("3")) {
                    lamp3.stato();
                    lamp3.click();
                    System.out.println("\n"+lamp3.getCount()+"\n");
                    lamp3.stato();
                    lamp3.getCorrente();
            }

        }
        return;
    }

}
