package main.models.kitchen;

import main.models.textils.Textil;

public class DishCloths extends Textil {

    protected int packageSize;

    public DishCloths() {
    }

    public DishCloths(double quantity, int price, int with, int lenght, boolean isDecorated, int packageSize) {
        super(quantity, price, with, lenght, isDecorated);
        this.packageSize = packageSize;
    }

    public int getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(int packageSize) {
        this.packageSize = packageSize;
    }

    @Override
    public String toString() {
        return "DishCloths{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", packageSize=" + packageSize +
                ", with=" + with +
                ", lenght=" + lenght +
                '}';
    }
}
