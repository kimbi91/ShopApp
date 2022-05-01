package main.models.kitchen;

public class Forks extends Utensil{

    protected int size;

    public Forks() {
    }

    public Forks(double quantity, int price, String material, int size) {
        super(quantity, price, material);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Forks{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", size=" + size +
                ", material='" + material + '\'' +
                '}';
    }
}
