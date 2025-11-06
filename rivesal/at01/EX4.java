package rivesal.at01;
import java.util.Scanner;
public class EX4 {

public static void main(String[] args){
    Scanner clavier = new Scanner(System.in); 
    int Valeur=0;
    
     
do{
System.out.print("Veuillez écrire un chiffre:");
Valeur=clavier.nextInt();
}while(Valeur<0 || Valeur>100 );
System.out.print("Votre Valeur est:"+Valeur);
}
}
