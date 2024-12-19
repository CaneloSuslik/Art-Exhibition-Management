// Main.java
public class Main {
    public static void main(String[] args) {
        // Create instances of classes
        Artist artist1 = new Artist("Vincent van Gogh", "Post-Impressionism");
        Artwork artwork1 = new Artwork("Starry Night", "Oil Painting", 1000000.0);
        Gallery gallery1 = new Gallery("MoMA", "New York");

        // Print objects to console
        System.out.println(artist1);
        System.out.println(artwork1);
        System.out.println(gallery1);

        // Compare objects
        Artwork artwork2 = new Artwork("Starry Night", "Oil Painting", 1000000.0);
        System.out.println("Are artworks equal? " + artwork1.equals(artwork2));
    }
}
