package softeam.cadextan.sg.test.kata;

import junit.framework.TestCase;
import softeam.cadextan.sg.test.kata.utils.KataUtils;


public class KataUtilsTest
        extends TestCase {


    public void testIsDividedBy() {

        assertTrue(KataUtils.isDividedBy(0, 3));
        assertTrue(KataUtils.isDividedBy(0, 5));

        assertFalse(KataUtils.isDividedBy(13, 3));
        assertFalse(KataUtils.isDividedBy(14, 5));

        assertTrue(KataUtils.isDividedBy(15, 3));
        assertTrue(KataUtils.isDividedBy(15, 5));

        assertTrue(KataUtils.isDividedBy(12, 3));
        assertFalse(KataUtils.isDividedBy(12, 5));

    }
}
