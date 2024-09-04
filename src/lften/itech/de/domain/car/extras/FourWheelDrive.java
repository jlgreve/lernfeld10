package lften.itech.de.domain.car.extras;

import lften.itech.de.domain.car.Extra;

public class FourWheelDrive extends Extra {

    public String toString() {
        return "Four Wheel Drive";
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof FourWheelDrive;
    }
}
