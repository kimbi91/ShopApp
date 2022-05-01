package main.models.drinks;

import main.models.Consumable;
import main.models.foods.Product;
import main.models.foods.UnitType;

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
