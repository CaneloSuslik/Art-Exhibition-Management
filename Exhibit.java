public abstract class Exhibit {
    private String title;

    public Exhibit(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public abstract String toString(); // Абстрактный метод для переопределения
}
