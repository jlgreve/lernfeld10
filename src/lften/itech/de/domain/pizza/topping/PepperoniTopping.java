package lften.itech.de.domain.pizza.topping;

import lften.itech.de.domain.pizza.Topping;

public class PepperoniTopping extends Topping {
    @Override
    public String toString() {
        return "Pepperoni";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof PepperoniTopping;
    }
}
