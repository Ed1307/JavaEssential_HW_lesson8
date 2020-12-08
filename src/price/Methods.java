package price;

import java.util.Scanner;

public class Methods {
    static void fillArray(Price[] prices){
        System.out.println("Введите название товара, магазин и цену");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            prices[i] = new Price(sc.next(), sc.next(), sc.nextInt());}
    }
    static void sortByShops(Price[] prices){
        if(prices[0].getShop().charAt(0)>prices[1].getShop().charAt(0)){
            Price w = prices[0];
            prices[0] = prices[1];
            prices[1] = w;
    }}
    static void print(Price[] prices){
        System.out.println("Введите название существующего магазина");
        Scanner sc = new Scanner(System.in);
        String yourShop = sc.next();
        Exception e = new Exception();
        try{
            boolean b = false;
            for (Price a:prices) {
                if(yourShop.equals(a.getShop())){
                    System.out.println(a.getName() + " " + a.getShop() + " " + a.getPrice());
                    b = true;
                }
            }
            if (!b) throw e;
        } catch (Exception e1){
            System.out.println("Такого магазина не существует");
        }
    }
}
