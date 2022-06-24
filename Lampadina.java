/*Progettare una classe Lampadina che rappresenti una
        lampadina elettrica
        • La lampadina può essere accesa, spenta o rotta
       • Espone due metodi
       • stato() che indica lo stato corrente della lampadina
        • click() che cambia lo stato da accesa a spenta o da spenta
        ad accesa, oppure rompe la lampadina
        • Una lampadina si rompe dopo un numero di click
        definito dal produttore
        • La classe deve contenere uno o più campi che ne descrivano
        lo stato
        • Un costruttore
        • I metodi indicati sopra*/

public class Lampadina {
        //attributi
        private boolean accesa;
        private boolean rotta;
        public final int clickMax = 3;
        private int count;
        private Impianto imp;


        //costruttori
        public Lampadina(Impianto imp) {
                this.accesa=false;
                this.rotta=false;
                this.count=0;
                this.imp=imp;

        }

        //metodi
        public void stato() {
                if(this.rotta==true){
                        System.out.println("La lapmadina e' rotta \n");
                }
                else if(this.imp.getImpianto()==false||this.accesa==false){
                        System.out.println("La lampadina e' spenta \n");
                }
                else {
                        System.out.println("La lampadina e' accesa \n");
                }

        }

        public void click() {
                if (this.imp.getImpianto()==false){
                                this.accesa = false;
                }
                else{
                        if (this.count < this.clickMax-1) {
                                this.accesa=!accesa;
                                this.count++;
                        }
                        else {
                                this.rotta=true;
                        }
                }

        }

        public void getCorrente() {
                if(this.imp.getImpianto())
                        System.out.println("Corrente accesa \n");
                else
                        System.out.println("Corrente spenta \n");
        }
        public int getCount() {
                return this.count;
        }


}
