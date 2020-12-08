package price;

public class Price {
    private String name;
    private String shop;
    private int price;

    public Price(String name, String shop, int price) {
        this.name = name;
        this.shop = shop;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getShop() {
        return shop;
    }
    public int getPrice() {
        return price;
    }
}
