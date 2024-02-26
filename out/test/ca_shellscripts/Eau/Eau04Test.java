package Eau;

import org.junit.Test;

import static org.junit.Assert.assertFalse;


public class Eau04Test {

    @Test
    public void testEntree(){
        boolean isP = Eau04.isPrime(12);
        assertFalse(isP);
    }
}