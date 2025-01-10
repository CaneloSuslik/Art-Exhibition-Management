public class Main {
    public static void main(String[] args) {
        // Создаем художника
        Artist artist1 = new Artist("Vincent van Gogh", "Post-Impressionism");


        Artwork artwork1 = new Artwork("Starry Night", "Oil Painting", 1000000.0);
        Artwork artwork2 = new Artwork("Sunflowers", "Oil Painting", 800000.0);


        Gallery gallery = new Gallery("MoMA", "New York");
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);


        System.out.println(artist1);
        System.out.println(gallery);
        gallery.getArtworks().forEach(System.out::println);
    }
}

