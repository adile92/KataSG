package softeam.cadextan.sg.test.kata.service;

import softeam.cadextan.sg.test.kata.utils.KataUtils;

/**
 * Created by Adile on 28/02/2016.
 */
public class KataServiceImpl implements KataService {

    public void fizzBuzz(Integer i) {

        boolean isDivisible = false;
        StringBuilder sb = new StringBuilder();

        if (KataUtils.isDividedBy(i, 3)) {
            sb.append("Fizz");
            isDivisible = true;
        }

        if (KataUtils.isDividedBy(i, 5)) {

            // ajout espace si deja divisible par 3
            if (isDivisible) {
                sb.append(" ");
            }

            sb.append("Buzz");
            isDivisible = true;
        }

        if (isDivisible)
            System.out.println(sb.toString());
        else
            System.out.println(i);


    }
}
