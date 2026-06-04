package es1;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = new Rectangle(10, 20);

//   siccome stampaRettangolo è static non serve che specifichi l'oggetto che chiama
        Rectangle.stampaRettangolo(r1); //classe Rectangle, stampa r1
// Se il metodo NON fosse static, dovremmo chiamarlo tramite un oggetto:
// r1.stampaRettangolo(...)
        Rectangle.stampaDueRettangoli(r1,r2);

    }


}
