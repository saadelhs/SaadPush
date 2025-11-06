package elhsSA.at01;

import java.util.Scanner;

public class EX2J2 {
    public static void main(String[] args) {
        
    
     Scanner scanner = new Scanner(System.in);

        System.out.print("ecrivez un mot ou une phrase : ");
        String sTexte = scanner.nextLine();
        int iCharactherCount = sTexte.length();

        System.out.print(iCharactherCount);

        scanner.close();
        }
        
              }




