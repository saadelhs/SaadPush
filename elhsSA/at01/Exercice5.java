package elhsSA.at01;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args){
    Scanner clavier = new Scanner(System.in); 
    System.out.print("Inserer votre montant:");
    double Montant = clavier.nextDouble();

    double Prix= (Montant)*0.75 ;
    System.out.print("Votre montant final apres le rabais est de :" +Prix);

clavier.close();
}

}
