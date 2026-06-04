package es2;

import java.util.Arrays;

public class SIM {

    //    attributi
private String number;
private double credit;
private Chiamata[] listaChiamate;

//    costruttori
public SIM(String number){
   this.number = number;
   this.credit = 0.0;
   this.listaChiamate = new Chiamata[5];
}

//    getter e setter

//    metodi di istanza
    public void stampaDatiSIM(){
        System.out.println("Numero: " + number);
        System.out.println("Credito: " + credit);
        System.out.println("Lista Chiamate: " + Arrays.toString(listaChiamate));
    }

    public void setListaChiamate(Chiamata[] listaChiamate){
        this.listaChiamate = listaChiamate;
    }

//    metodi static

}
