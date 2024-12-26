// Artist.java
class Artist { 
    private String name;
    private String style;

    public Artist(String name, String style) {
        this.name = name;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}

public class Main { 
    public static void main(String[] args) {
        Artist artist = new Artist("Pablo Picasso", "Cubism");
        System.out.println(artist);
    }
}

