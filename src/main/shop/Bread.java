package main.shop;

// gyerekosztály / származtatott osztály
public class Bread extends Food {

    public Bread() {
        super(1.0, "kilo", false, 10);
    }

    public Bread(double quantity, int price) {
        super(quantity, "kilo", price);
    }

    public Bread(double quantity, String unitType, boolean isLongLife, int price) {
        super(quantity, unitType, isLongLife, price);
    }

    public void increasePrice() {
        price = price + 1;
        // setPrice( getPrice() + 1 );
    }

    public void x() {
        quantity = 1.5;
    }

}
