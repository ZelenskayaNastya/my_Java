public class Product {
    private long id;
    private String name;
    private int weight;
    private String color;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Product( long id, String name, int weight, String color) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
}
