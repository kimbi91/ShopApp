package main.models.foods;

import javax.lang.model.type.UnionType;

// ősosztályom!
public class Product {

    protected double quantity;
    protected UnitType unitType;
    protected boolean isLongLife;
    protected int price;

    public Product() {

    }

    public Product(double quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Product(double quantity, UnitType unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    // konstruktor
    public Product(double quantity, UnitType unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

    public static void printInfo() {
        System.out.println("info");
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public boolean isLongLife() {
        return isLongLife;
    }

    public void setLongLife(boolean longLife) {
        isLongLife = longLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
