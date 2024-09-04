package lften.itech.de.domain.car;

import lften.itech.de.domain.car.engine.SuvEngine;
import lften.itech.de.domain.car.extras.FourWheelDrive;
import lften.itech.de.domain.car.tire.SuvTire;

public class Suv extends Car {
    public Suv() {
        super(4, new SuvEngine(), new SuvTire(), new Extra[]{ new FourWheelDrive() });
    }
}
