package calculator2;

public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        try{
        System.out.println(calc.div(5, 0));
    } catch(MyException me){
            System.out.println(me.toString());
        }
}}
