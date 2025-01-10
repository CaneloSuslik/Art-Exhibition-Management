public class Artwork extends Exhibit {
    private String medium;
    private double price;

    public Artwork(String title, String medium, double price) {
        super(title); // Вызов конструктора Exhibit
        this.medium = medium;
        this.price = price;
    }

    public String getMedium() {
        return medium;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Artwork{title='" + getTitle() + "', medium='" + medium + "', price=" + price + "}";
    }
}
