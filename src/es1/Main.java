package es1;

public class Main {
    static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = new Rectangle(10, 20);

//   siccome stampaRettangolo è static non serve che specifichi l'oggetto che chiama
        Rectangle.stampaRettangolo(r1); //classe Rectangle, stampa r1
//    r1.stampaRettangolo() instance reference to obj r1
        Rectangle.stampaDueRettangoli(r1,r2);

    }


}
