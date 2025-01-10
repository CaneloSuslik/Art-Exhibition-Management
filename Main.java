import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        Artist artist1 = new Artist(1, "Vincent van Gogh", "Post-Impressionism");
        Artist artist2 = new Artist(2, "Claude Monet", "Impressionism");

        
        Artwork artwork1 = new Artwork(1, "Starry Night", "Oil Painting", 1000000.0);
        Artwork artwork2 = new Artwork(2, "Sunflowers", "Oil Painting", 800000.0);
        Artwork artwork3 = new Artwork(3, "Water Lilies", "Oil Painting", 1200000.0);

        
        Gallery gallery = new Gallery("MoMA", "New York");
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        gallery.addArtwork(artwork3);

        
        List<Artwork> sortedArtworks = gallery.getArtworks().stream()
                .sorted(Comparator.comparing(Artwork::getPrice))
                .collect(Collectors.toList());

        
        List<Artwork> expensiveArtworks = gallery.getArtworks().stream()
                .filter(artwork -> artwork.getPrice() > 1000000)
                .collect(Collectors.toList());
        
        
        System.out.println("Артисты:");
        System.out.println(artist1);
        System.out.println(artist2);

        System.out.println("\nГалерея:");
        System.out.println(gallery);

        System.out.println("\nВсе работы:");
        gallery.getArtworks().forEach(System.out::println);

        System.out.println("\nРаботы, отсортированные по цене:");
        sortedArtworks.forEach(System.out::println);

        System.out.println("\nРаботы дороже 1 млн:");
        expensiveArtworks.forEach(System.out::println);

        
        Address galleryAddress = new Address("New York", "11 W 53rd St");
        System.out.println("\nАдрес галереи:");
        System.out.println(galleryAddress);
    }
}
