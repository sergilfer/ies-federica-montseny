package org.iesfm.calculator;

public class Calculator implements ICalculator{
    @Override
    public double sum(double a, double b) {
        return a+b;
    }
    @Override
    public double substract(double a, double b) {
        return a-b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double neg(double a) {
        return -a;
    }
}
