public class Artwork extends Entity {
    private String title;
    private String medium;
    private double price;

    public Artwork(int id, String title, String medium, double price) {
        super(id);
        this.title = title;
        this.medium = medium;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getMedium() {
        return medium;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Artwork{id=" + getId() + ", title='" + title + "', medium='" + medium + "', price=" + price + "}";
    }
}
