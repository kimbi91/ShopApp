package main.models.textils;

public class Bedding extends Textil{

    protected boolean isSet;

    public Bedding() {
    }

    public Bedding(double quantity, int price, int with, int lenght, boolean isDecorated, boolean isSet) {
        super(quantity, price, with, lenght, isDecorated);
        this.isSet = isSet;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setSet(boolean set) {
        isSet = set;
    }

    @Override
    public String toString() {
        return "Bedding{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", isSet=" + isSet +
                ", with=" + with +
                ", lenght=" + lenght +
                ", isDecorated=" + isDecorated +
                '}';
    }
}
