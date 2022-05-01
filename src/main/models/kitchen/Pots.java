package main.models.kitchen;

public class Pots extends Utensil{

    protected int diameter;


    public Pots() {
    }

    public Pots(double quantity, int price, String material, int diameter) {
        super(quantity, price, material);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Pots{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
