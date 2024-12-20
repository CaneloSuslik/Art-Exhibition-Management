// Gallery.java
public class Gallery {
    private String name;
    private String location;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters and Setters
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
}
