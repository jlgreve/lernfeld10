package lften.itech.de.domain.car;

public class Car {
    private final int seatNumber;
    private final Engine engine;
    private final Tire tire;
    private final Extra[] extras;

    public Car(int seatNumber, Engine engine, Tire tire, Extra[] extras) {
        this.seatNumber = seatNumber;
        this.engine = engine;
        this.tire = tire;
        this.extras = extras;
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder()
                .append("This is a car with ")
                .append(seatNumber)
                .append(" seats, ")
                .append(tire)
                .append(" tires and a ")
                .append(engine)
                .append(". \nIt has the following extras: ");

        if (extras.length > 0) {
            stringBuilder.append(extras[0]);
        }

        for (int i = 1; i < extras.length; i++) {
            stringBuilder.append(", ")
                    .append(extras[i]);
        }

        return stringBuilder.toString();
    }
}
