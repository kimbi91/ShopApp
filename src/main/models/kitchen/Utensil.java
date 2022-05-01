package main.models.kitchen;

import main.models.foods.Product;

import java.util.Objects;

public class Utensil extends Product {

    protected String material;

    public Utensil() {
    }

    public Utensil(double quantity, int price, String material) {
        super(quantity, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Utensil{" +
                "quantity=" + quantity +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utensil utensil = (Utensil) o;
        return Objects.equals(material, utensil.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }
}
