package main.models.textils;

import main.models.foods.Product;

import java.util.Objects;

public class Textil extends Product {

    protected int with;
    protected int lenght;
    boolean isDecorated;

    public Textil() {
    }

    public Textil(double quantity, int price, int with, int lenght, boolean isDecorated) {
        super(quantity, price);
        this.with = with;
        this.lenght = lenght;
        this.isDecorated = isDecorated;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public boolean isDecorated() {
        return isDecorated;
    }

    public void setDecorated(boolean decorated) {
        isDecorated = decorated;
    }

    @Override
    public String toString() {
        return "Textil{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", with=" + with +
                ", lenght=" + lenght +
                ", isDecorated=" + isDecorated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Textil textil = (Textil) o;
        return with == textil.with && lenght == textil.lenght && isDecorated == textil.isDecorated;
    }

    @Override
    public int hashCode() {
        return Objects.hash(with, lenght, isDecorated);
    }
}
