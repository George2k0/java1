package ge.edu.btu.calculator.service.impl;

class CalculatorServiceimpl implements CalculatorService {
    @Override
    public void sum(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void divide(int x, int y) {
        try{
            System.out.println(x/y);
       }catch(ArithmeticException exc){
            System.out.println("You can not divide by 0");
        }
    }

    @Override
    public void sum(double x, double y) {
        System.out.println(x+y);
    }

    @Override
    public void divide(double x, double y) {
        System.out.println(x/y);
    }
}