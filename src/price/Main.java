package price;

public class Main {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        Methods.fillArray(prices);
        Methods.sortByShops(prices);
        Methods.print(prices);
    }
}
