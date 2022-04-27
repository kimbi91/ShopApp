package main;

import main.shop.Bread;
import main.shop.Product;
import main.shop.Milk;

public class Main {

    public static void main(String[] args) {
        Product kaja1 = new Product();
        Product kaja2 = new Product();

        Bread kenyer = new Bread();

        Milk milk = new Milk();

        System.out.println(milk.getFat());

        Product[] products = {kaja1, kaja2, kenyer};

        System.out.println(kaja1.foodCounter);  // ez csúnya!
        System.out.println(kaja2.foodCounter);  // akárcsak ez!!!
        System.out.println(Product.foodCounter);
    }

    // DRY = DO NOT REPEAT YOURSELF!!!
    // kód leegyszerűsítése, könnyebb kezelhetősége

    // ---------------------

    /*
        élelmiszerek (ősosztály vagy anyaosztály vagy apaosztály):
            kenyér
            alma
            tej
            cukor
            sör
        vásárló:
            vásárló
                private Food[] cart;

     */

}
