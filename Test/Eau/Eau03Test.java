package Eau;//package Eau;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class Eau03Test {

    @Test
    public void testCalculerSuiteFibonacci() {
        List<Integer> resultat = Eau03.calculerSuiteFibonacci(10);

        // Vérifier quelques éléments de la suite pour s'assurer qu'ils sont corrects
        assertEquals("Le premier élément doit être 0", Integer.valueOf(0), resultat.get(0));
        assertEquals("Le deuxième élément doit être 1", Integer.valueOf(1), resultat.get(1));
        assertEquals("Le onzième élément (index 10) doit être 55", Integer.valueOf(55), resultat.get(10));
    }
}
