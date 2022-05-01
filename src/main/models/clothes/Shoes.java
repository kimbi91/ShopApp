package main.models.clothes;

public class Shoes extends Wearable{

    protected int sizeNumber;

    public Shoes() {
    }

    public Shoes(double quantity, int price, String brand, Gender gender, int size) {
        super(quantity, price, brand, gender);
        this.sizeNumber = size;
    }


    public int getSizeNumber() {
        return sizeNumber;
    }

    public void setSizeNumber(int sizeNumber) {
        this.sizeNumber = sizeNumber;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "sizeNumber=" + sizeNumber +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
