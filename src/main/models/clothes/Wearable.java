package main.models.clothes;

import main.models.foods.Product;

import java.util.Objects;

public class Wearable extends Product {

    protected String brand;
    protected Size size;
    protected Gender gender;

    public Wearable() {
    }

    public Wearable(double quantity, int price, String brand, Size size, Gender gender) {
        super(quantity, price);
        this.brand = brand;
        this.size = size;
        this.gender = gender;
    }

    public Wearable(double quantity, int price, String brand, Gender gender) {
        super(quantity, price);
        this.brand = brand;
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wearable wearable = (Wearable) o;
        return Objects.equals(brand, wearable.brand) && size == wearable.size && gender == wearable.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size, gender);
    }
}
