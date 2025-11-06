package rivesal.at01;

import java.util.Scanner;

public class EX3 {
public static void main(String[] args) {

    String reponse=null;
    String phrase=null;
    int ctr =0;

      Scanner lectureClavier = new Scanner(System.in);
      System.out.print("Veuillez insérer une phrase:");
      System.out.println("Lecture d'une phrase : ");
		phrase = lectureClavier.nextLine();

		reponse = phrase.toUpperCase();
		System.out.println("Chaine phrase: " + phrase);
		
		for (int i = 0; i < phrase.length(); i++)
		{
			if (phrase.charAt(i) == 'a')
			{
				ctr++;
			}
		}
		
		System.out.println("Nombre de a: " + ctr);
   
   
		reponse = phrase.replace("a", "$");
		System.out.println("Phrase apr�s: " + reponse);


}
}
