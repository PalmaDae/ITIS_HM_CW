package Task_7;

public class Flower {
    private String name;
    private String country;
    private int shelfLife;
    private double price;
    private static int totalSold = 0;

    public Flower(String name, String country, int shelfLife, double price) {
        this.name = name;
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public static void addSoldFlowers(int count) {
        totalSold += count;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalSold() {
        return totalSold;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }
}
