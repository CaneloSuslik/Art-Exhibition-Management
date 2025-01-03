// Artwork.java
public class Artwork {
    private String title;
    private String type;
    private double price;

    public Artwork(String title, String type, double price) {
        this.title = title;
        this.type = type;
        this.price = price;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
    

public class Painting extends Artwork {
    public Painting(String title, String artist) {
        super(title, artist);
    }

    @Override
    public String getType() {
        return "Painting";
    }
}
