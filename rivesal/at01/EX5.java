package rivesal.at01;

import java.util.Scanner;

public class EX5 {

public static void main(String[] args){
    Scanner clavier = new Scanner(System.in); 

  
    System.out.println("Voici lalphabet:");
    for(char lettre='a' ; lettre <='z'; lettre++){

System.out.print(lettre+" ");


   } 
   System.out.println("Voici lalphabet:");
   for(char lettre='z'; lettre >='a'; lettre--){

     System.out.print(lettre+" ");

    }
    clavier.close();
}
}