package calculator2;

public class Calculator {
    int sum(int a, int b){
        return a+b;
    }
    int min(int a, int b){
        return a-b;
    }
    int mul(int a, int b){
        return a*b;
    }
    int div(int a, int b) throws MyException{
        if (b==0) throw new MyException();
            return a/b;
    }
}
