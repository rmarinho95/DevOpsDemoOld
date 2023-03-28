package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MathLibTest {

    @Test
    public void testIsEven1() {
        boolean result = MathLib.isEven(8);
        assertTrue(result);

    }
    
    @Test
    public void testIsEven2() {
        boolean result = MathLib.isEven(10);
        assertTrue(result);

    }
}
