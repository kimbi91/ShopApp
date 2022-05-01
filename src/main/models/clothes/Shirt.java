package main.models.clothes;

public class Shirt extends Wearable{

    protected boolean isDecorated;

    public Shirt() {
    }

    public Shirt(double quantity, int price, String brand, Size size, Gender gender, boolean isDecorated) {
        super(quantity, price, brand, size, gender);
        this.isDecorated = isDecorated;
    }

    public boolean isDecorated() {
        return isDecorated;
    }

    public void setDecorated(boolean decorated) {
        isDecorated = decorated;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "isDecorated=" + isDecorated +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
