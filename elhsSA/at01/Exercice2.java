package elhsSA.at01;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); 
        System.out.print("Veuillez écrire votre salaire :");
        double Salaire = clavier.nextDouble();

         System.out.print("Veuillez écrire le nombre d'heures travaillé par semaine :");
         int horaire = clavier.nextInt();

         double SalaireQuizaine = Salaire*horaire*2;
         
         System.out.print("Votre Salaire pour la Quinzaine est :"+ SalaireQuizaine);

        clavier.close();
    }
}
