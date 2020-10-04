package ge.edu.btu.calculator.service.impl;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceimpl obj = new CalculatorServiceimpl();
        obj.sum(5,10);
        obj.divide(10,0);
        obj.sum(2.12, 4.12);
        obj.divide(3.12, 4);
    }
}