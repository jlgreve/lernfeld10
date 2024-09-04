package lften.itech.de;

import lften.itech.de.domain.car.Car;
import lften.itech.de.domain.car.Extra;
import lften.itech.de.domain.car.Suv;
import lften.itech.de.domain.car.engine.SportsEngine;
import lften.itech.de.domain.car.engine.SuvEngine;
import lften.itech.de.domain.car.extras.Spoiler;
import lften.itech.de.domain.car.tire.SportsTire;
import lften.itech.de.domain.pizza.PizzaBuilder;
import lften.itech.de.domain.pizza.dough.NeapolitanDough;
import lften.itech.de.domain.pizza.dough.NewYorkDough;
import lften.itech.de.domain.pizza.sauce.HollandaiseSauce;
import lften.itech.de.domain.pizza.sauce.TomatoSauce;
import lften.itech.de.domain.pizza.topping.AsparagusTopping;
import lften.itech.de.domain.pizza.topping.PepperoniTopping;

public class Main {
    public static void main(String[] args) {

        var pizza1 = new PizzaBuilder()
                .withDiameter(32)
                .withDough(new NeapolitanDough())
                .withSauce(new HollandaiseSauce())
                .withTopping(new AsparagusTopping())
                .withTopping(new PepperoniTopping())
                .build();

        System.out.println("The first pizza looks like this:\n" + pizza1 + "\n");

        var pizza2 = new PizzaBuilder()
                .withDiameter(12)
                .withDough(new NewYorkDough())
                .withSauce(new TomatoSauce())
                .withTopping(new AsparagusTopping())
                .build();

        System.out.println("The second pizza looks like this:\n" + pizza2 + "\n");

        var sportsCar = new Car(2, new SportsEngine(), new SportsTire(), new Extra[]{ new Spoiler() });
        var suv = new Suv();
        System.out.println("The first car looks like this:\n" + sportsCar + "\n");
        System.out.println("The second car looks like this:\n" + suv + "\n");
    }
}