package lften.itech.de.domain.car.extras;

import lften.itech.de.domain.car.Extra;

public class Spoiler extends Extra {
    public String toString() {
        return "Spoiler";
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Spoiler;
    }
}
