package softeam.cadextan.sg.test.kata;

import softeam.cadextan.sg.test.kata.service.KataService;
import softeam.cadextan.sg.test.kata.service.KataServiceImpl;

import java.util.Scanner;

/**
 * Kata App
 */
public class App {
    public static void main(String[] args) {
        KataService kataService = new KataServiceImpl();

        System.out.println("Saisir 1337 pour quitter le programme");

        while (true) {
            try {

                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();

                kataService.fizzBuzz(i);

                if (i == 1337)
                    break;

            } catch (Exception e) {
                // Message d'erreur et on ne remonte pas l'exeption car inutile dans le test
                System.err.println("Veuillez saisir un entier valide");
            }

        }

        System.out.println("Bye +");


    }
}
