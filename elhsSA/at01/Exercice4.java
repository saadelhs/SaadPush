package elhsSA.at01;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args){
    Scanner clavier = new Scanner(System.in); 

    System.out.print("Inserer votre note de math:");
    int Note = clavier.nextInt();

    if (Note>=60) {
        System.out.print("Felicitation vous avez réussi votre cours de math");
    }
    else if (Note<60) {
        System.out.print("Vous avez échoué votre cours de math");
    }
    clavier.close();
}

}