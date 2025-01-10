public class Artist extends Entity {
    private String name;
    private String style;

    public Artist(int id, String name, String style) {
        super(id);
        this.name = name;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Artist{id=" + getId() + ", name='" + name + "', style='" + style + "'}";
    }
}
