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
           ", artist='" + artist + '\'' +
           '}';
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Artwork artwork = (Artwork) o;
    return Objects.equals(title, artwork.title) &&
           Objects.equals(artist, artwork.artist);
}

@Override
public int hashCode() {
    return Objects.hash(title, artist);
}

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
