package lften.itech.de.domain.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private int diameter;
    private Dough dough;
    private Sauce sauce;
    private final List<Topping> toppings = new ArrayList<>();

    public PizzaBuilder withDiameter(int diameter) {
        if (diameter < 10) {
            throw new IllegalArgumentException("The pizza must be at least 10 cm!");
        }

        this.diameter = diameter;
        return this;
    }

    public PizzaBuilder withDough(Dough dough) {
        if (dough == null) {
            throw new IllegalArgumentException("The dough must not be null!");
        }

        this.dough = dough;
        return this;
    }

    public PizzaBuilder withSauce(Sauce sauce) {
        if (sauce == null) {
            throw new IllegalArgumentException("The sauce must not be null!");
        }

        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder withTopping(Topping topping) {
        if (topping == null) {
            throw new IllegalArgumentException("The topping must not be null!");
        }

        if (toppings.stream().anyMatch(t -> t.equals(topping))) {
            throw new IllegalArgumentException("This pizza already has " + topping + "!");
        }

        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new Pizza(
                diameter,
                dough,
                sauce,
                toppings.toArray(new Topping[0])
        );
    }
}
