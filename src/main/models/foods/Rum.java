package main.models.foods;

public class Rum extends Drink {

    private int abv;

    public Rum() {
        super(1.0, UnitType.DECILITER, false, 20);
        this.abv = 40;
    }

    public Rum(double quantity, int price) {
        super(quantity, UnitType.DECILITER, price);
        this.abv = 40;
    }

    public Rum(double quantity, UnitType unitType, boolean isLongLife, int price, int abv) {
        super(quantity, unitType, isLongLife, price);
        this.abv = abv;
    }

    public int getAbv() {
        return abv;
    }

    public void setAbv(int abv) {
        this.abv = abv;
    }

}
