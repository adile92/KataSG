package softeam.cadextan.sg.test.kata.utils;

/**
 * Created by Adile on 27/02/2016.
 */
public class KataUtils {

    private KataUtils(){

    }

    /**
     * Return true si l'entier est divisible par le diviseur
     *
     * @param value
     * @param divider
     * @return
     */
    public static boolean isDividedBy(Integer value, Integer divider) {
        if (value % divider == 0)
            return true;
        else
            return false;
    }
}
