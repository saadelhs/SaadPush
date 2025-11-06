package elhsSA.at01;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); 
        System.out.print("Veuillez inserer l'age de la premiere personne:");
        int Age1 = clavier.nextInt();

        System.out.print("Veuillez inserer l'age de la deuxieme personne:");
        int Age2 = clavier.nextInt();
    
        double Moyenne = (Age1+Age2) / 2.0;

int plusVieilAge;
        if (Age1 > Age2) {
            plusVieilAge = Age1;
        } else if (Age2 > Age1) {
            plusVieilAge = Age2;
        } else {
            plusVieilAge = Age1; 
        }

        System.out.print("Le plus vieil age est:" +plusVieilAge);

        System.out.print("La moyenne de des deux age est :" +Moyenne);

clavier.close();
}
    
}
