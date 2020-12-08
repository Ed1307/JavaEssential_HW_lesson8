package calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(div(4, 0));
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int minus(int a, int b){
        return a-b;
    }
    static int mult(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        try{
            return a/b;
        } catch(ArithmeticException ar){
            System.out.println("На ноль делить нельзя");
            return -1;
        }
    }
}
