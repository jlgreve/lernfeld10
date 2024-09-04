package lften.itech.de;

import lften.itech.de.domain.pizza.PizzaBuilder;
import lften.itech.de.domain.pizza.dough.NeapolitanDough;
import lften.itech.de.domain.pizza.sauce.HollandaiseSauce;
import lften.itech.de.domain.pizza.topping.AsparagusTopping;
import lften.itech.de.domain.pizza.topping.PepperoniTopping;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var pizza1 = new PizzaBuilder()
                .withDiameter(32)
                .withDough(new NeapolitanDough())
                .withSauce(new HollandaiseSauce())
                .withTopping(new AsparagusTopping())
                .withTopping(new PepperoniTopping())
                .build();

        System.out.println("The first pizza looks like this:\n" + pizza1);

        var pizza2 = new PizzaBuilder()
                .withDiameter(12)
                .withTopping(new AsparagusTopping())
                .withTopping(new AsparagusTopping())
                .build();

        System.out.println("The second pizza looks like this:\n" + pizza2);
    }
}