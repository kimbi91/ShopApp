package main;

import main.models.Consumable;
import main.models.Customer;

public class Main {

    public static void main(String[] args) {

        Customer buyer = new Customer("név");

        Class cl = buyer.getClass();

        String clClassnameWithPackages = cl.getName();
        String clClassname = cl.getSimpleName();



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
