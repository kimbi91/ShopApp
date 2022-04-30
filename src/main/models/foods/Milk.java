package main.models.foods;

public class Milk extends Drink {

    private double fat;

    public Milk() {
        super(1.0, "liter", false, 50);
        this.fat = 1.5;
    }

    public Milk(double quantity, int price) {
        super(quantity, "liter", price);
        this.fat = 1.5;
    }

    public Milk(double quantity, String unitType, boolean isLongLife, int price, double fat) {
        super(quantity, unitType, isLongLife, price);
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

}
