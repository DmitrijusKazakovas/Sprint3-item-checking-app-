package Sprint3;

public class FishClass {

    private double price;
    private int weight;
    private String name;

    public FishClass(double price, int weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
