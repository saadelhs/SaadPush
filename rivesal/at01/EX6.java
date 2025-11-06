package rivesal.at01;

import java.util.Scanner;

public class EX6 {
public static void main(String[] args) {
    Scanner clavier=new Scanner(System.in); 
    int valeur=clavier.nextInt();
    int min=Integer.MIN_VALUE;
    int max=Integer.MAX_VALUE;
    int somme=0;
    int compteur=0;
    
System.out.print("Veuillez écrire un chiffre (Si vous écrivez 0 ca sarrete)");
   valeur=clavier.nextInt();
    do{
   
   if (valeur !=0) {
    if (valeur>max) {
        max=valeur;
    }
    if (valeur<min) {
        min=valeur;
    }
    somme+=valeur;
    compteur++;
   }
    }
    while(compteur==0);
     if (compteur > 0) {
            double moyenne = (double) somme / compteur;

            System.out.println("La plus grande valeur : " + max);
            System.out.println("La plus petite valeur : " + min);
            System.out.println("La moyenne des valeurs : " + moyenne);
}
}
}
