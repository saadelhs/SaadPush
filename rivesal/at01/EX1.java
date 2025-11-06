package rivesal.at01;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args){
    Scanner clavier = new Scanner(System.in); 
    System.out.print("Veuillez inserer une phrase ou un mot:");
    String texte = clavier.nextLine();
    String texteMajuscule = texte.toUpperCase();
    System.out.print("Voici votre texte en majuscule:"+texteMajuscule);

clavier.close();
}
}