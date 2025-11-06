package elhsSA.at01;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lecture des deux nombres
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = sc.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = sc.nextInt();

        // Comparaison des deux nombres
        if (nombre1 > nombre2) {
            System.out.println("Le nombre le plus élevé est : " + nombre1);
        } else if (nombre2 > nombre1) {
            System.out.println("Le nombre le plus élevé est : " + nombre2);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }

        sc.close();
    }
}

