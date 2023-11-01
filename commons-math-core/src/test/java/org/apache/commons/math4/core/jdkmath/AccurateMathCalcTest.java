package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccurateMathCalcTest {

    @Test
    public void testSlowSin() {
        double x = 0.5;
        double expected = Math.sin(x);
        double[] result = new double[2];
        AccurateMathCalc.slowSin(x, result);
        double actual = result[0] + result[1];
        assertEquals(expected, actual, 1e-15);
    }

    @Test
    public void testSlowCos() {
        double x = 0.5;
        double expected = Math.cos(x);
        double[] result = new double[2];
        AccurateMathCalc.slowCos(x, result);
        double actual = result[0] + result[1];
        assertEquals(expected, actual, 1e-15);
    }

    @Test
    public void testSlowExp() {
        double x = 0.5;
        double expected = Math.exp(x);
        double[] result = new double[2];
        AccurateMathCalc.slowexp(x, result);
        double actual = result[0] + result[1];
        assertEquals(expected, actual, 1e-15);
    }
}