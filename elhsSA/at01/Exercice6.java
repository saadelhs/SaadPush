package elhsSA.at01;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args){
    Scanner clavier = new Scanner(System.in); 
    System.out.print("Vous avez le choix entre 3 types de plancher (1- Chêne, 2- Érable, 3-Pin):");
    int Choix= clavier.nextInt();
    if (Choix == 1) {
        System.out.print("Vous avez choisi le type de plancher : Chêne");
    }
    else if (Choix == 2) {
        System.out.print("Vous avez choisi le type de plancher : Érable");        
    }
    else if (Choix == 3) {
        System.out.print("Vous avez choisi le type de plancher : Pin");
    }
    else {
System.out.print("Vous n’avez pas choisit le bon type de plancher");
        }

        clavier.close();
}

}