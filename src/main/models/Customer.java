package main.models;

import main.models.foods.Product;

public class Customer {

    private String name;
    private int money;
    private Product[] cart;

    public Customer(String name) {
        this(name, 5000, 10);
    }

    public Customer(String name, int money, int cartSize) {
        this.name = name;
        this.money = money;
        this.cart = new Product[cartSize];
    }

    public boolean couldPutIntoCart(Product toBuy) {
        int nextCartIndex = findNextFreeCartSpot();

        if (nextCartIndex < cart.length) {
            cart[nextCartIndex] = toBuy;
            return true;
        }

        return false;
    }

    private int findNextFreeCartSpot() {
        int i = 0;

        while (i < cart.length && cart[i] != null) {
            i++;
        }

        return i;
    }

    public void payTheBill(int bill) {
        money -= bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Product[] getCart() {
        return cart;
    }

    public void setCart(Product[] cart) {
        this.cart = cart;
    }

}
