package org.iesfm.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    private Calculator calculator = new Calculator();

    private final static double DELTA = 0.000001;
    @Test
    public void sumPositiveNumbersTest() {
        //Configuracion del escenario
        double a = 2;
        double b = 5;

        //Ejecucion del test
        double res = calculator.sum(a,b);

        //Comprobacion del test
        Assert.assertEquals(7,res,DELTA);
    }

    @Test
    public void sumNegativeNumbersTest() {
        //Configuracion del escenario
        double a = 2;
        double b = 5;

        //Ejecucion del test
        double res = calculator.substract(a,b);

        //Comprobacion del test
        Assert.assertEquals(-3,res,DELTA);
    }
    @Test
    public void sumDivNumbersTest() {
        //Configuracion del escenario
        double a = 2;
        double b = 5;

        //Ejecucion del test
        double res = calculator.div(a,b);

        //Comprobacion del test
        Assert.assertEquals(0.4,res,DELTA);
    }
    @Test
    public void sumMultiplyNumbersTest() {
        //Configuracion del escenario
        double a = 2;
        double b = 5;

        //Ejecucion del test
        double res = calculator.multiply(a,b);

        //Comprobacion del test
        Assert.assertEquals(10,res,DELTA);
    }
    @Test
    public void sumNegNumbersTest() {
        //Configuracion del escenario
        double a = 2;
        //Ejecucion del test
        double res = calculator.neg(a);

        //Comprobacion del test
        Assert.assertEquals(-2,res,DELTA);
    }
}
