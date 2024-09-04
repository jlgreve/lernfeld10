package lften.itech.de.domain.pizza.topping;

import lften.itech.de.domain.pizza.Topping;

public class AsparagusTopping extends Topping {
    @Override
    public String toString() {
        return "Asparagus";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AsparagusTopping;
    }
}
