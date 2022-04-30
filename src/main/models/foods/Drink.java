package main.models.foods;

import main.models.Consumable;

public class Drink extends Product implements Consumable {

    public Drink(double quantity, UnitType unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    public Drink(double quantity, UnitType unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

}
