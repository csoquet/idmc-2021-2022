package exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = 0 ;
        while(n == 0){
            System.out.println("Bonjour, veuillez sélectionner une option :");
            System.out.println("1. Sélectionner café !");
            System.out.println("2. Sélectionner thé !");
            System.out.println("3. Sélectionner chocolat chaud !");
            System.out.println("4. Sélectionner cappucino !");
            System.out.println("5. Sélectionner soupe !");
            try{
                n = reader.nextInt();
            } catch(InputMismatchException exception){
                System.out.println("Entier seulement !");
                reader.nextLine();
            }
        }


        switch (n){

            case 1 :
                System.out.println("Vous avez choisi café");
                break;
            case 2 :
                System.out.println("Vous avez choisi thé");
                break;
            case 3 :
                System.out.println("Vous avez choisi chocolat chaud");
                break;
            case 4 :
                System.out.println("Vous avez choisi cappucino");
                break;
            case 5 :
                System.out.println("Vous avez choisi soupe");
                break;
            default:
                System.out.println("Choix incorrect");
                break;
        }
    }
}
