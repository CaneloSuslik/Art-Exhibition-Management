// Gallery.java
public class Gallery {
    private String name;
    private String location;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    public List<Artwork> filterArtworksByArtist(String artist) {
    return artworks.stream()
                   .filter(artwork -> artwork.getArtist().equalsIgnoreCase(artist))
                   .collect(Collectors.toList());
}

public Artwork findArtworkByTitle(String title) {
    return artworks.stream()
                   .filter(artwork -> artwork.getTitle().equalsIgnoreCase(title))
                   .findFirst()
                   .orElse(null);
}

public void sortArtworksByDate() {
    artworks.sort(Comparator.comparing(Artwork::getCreationDate));
}

}
