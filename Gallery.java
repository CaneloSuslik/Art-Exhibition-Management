import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private String name;
    private String location;
    private List<Artwork> artworks;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
        this.artworks = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public List<Artwork> getArtworks() {
        return new ArrayList<>(artworks);
    }

    @Override
    public String toString() {
        return "Gallery{name='" + name + "', location='" + location + "'}";
    }
}

}
