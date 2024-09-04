package lften.itech.de.domain.pizza;

public class Pizza {
    private final int diameter;
    private final Dough dough;
    private final Sauce sauce;
    private final Topping[] toppings;

    Pizza(
            int diameter,
            Dough dough,
            Sauce sauce,
            Topping[] toppings
    ) {
        this.diameter = diameter;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder()
                .append("This is a ")
                .append(diameter)
                .append("-cm pizza made with ")
                .append(dough)
                .append(" dough and covered with ")
                .append(sauce)
                .append(" sauce. \nIt has the following toppings: ");

        if (toppings.length > 0) {
            stringBuilder.append(toppings[0]);
        }

        for (int i = 1; i < toppings.length; i++) {
            stringBuilder.append(", ")
                    .append(toppings[i]);
        }

        return stringBuilder.toString();
    }
}
