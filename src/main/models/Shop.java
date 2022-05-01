package main.models;

import main.models.drinks.Milk;
import main.models.drinks.Rum;
import main.models.foods.*;

import java.util.Locale;

public class Shop {

    private Product[] products;
    private boolean isOpen;
    private int income;

    public Shop() {}

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public Product findProduct(String productName) {

        Class classToFind = findClassByName(productName);

        for (Product product : products) {
            if (product.getClass().equals(classToFind)) {
                return product;
            }
        }

        return null;
    }

    private Class findClassByName(String className) {

        return switch (className.toLowerCase(Locale.ROOT)) {
            case "kenyér" -> Bread.class;
            case "cseresznye" -> Cherry.class;
            case "tej" -> Milk.class;
            case "rum" -> Rum.class;
            case "cukor" -> Sugar.class;
            default -> null;
        };

    }

    public void fillProducts(int productNumber) {
        products = new Product[productNumber];

        for (int i = 0; i < productNumber; i++) {
            products[i] = randomProduct();
        }
    }

    private Product randomProduct() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> new Bread();
            case 1 -> new Cherry();
            case 2 -> new Milk();
            case 3 -> new Rum();
            default -> new Sugar();
        };
    }

    public void cashDesk(Customer customer) {
        int bill = createBill(customer);

        if (bill <= customer.getMoney()) {
            customer.payTheBill(bill);
            addToIncome(bill);
            System.out.println("Customer successfully paid for the products.");
        } else {
            System.out.println("Customer does not have enough money to pay! Sorry.");
        }
    }

    private int createBill(Customer customer) {
        int sum = 0;

        for (Product product : customer.getCart()) {
            sum += product.getPrice();
        }

        return sum;
    }

    public void addToIncome(int money) {
        income += money;
    }

    public Product[] getProducts() {
        return products;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public int getIncome() {
        return income;
    }

}
