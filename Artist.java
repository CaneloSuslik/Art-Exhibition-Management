public class Artist extends Person {
    private String style;

    public Artist(String name, String style) {
        super(name);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Artist{name='" + name + "', style='" + style + "'}";
    }
}
