package Lec_22;

import java.util.Comparator;

public class CarName implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.compareTo(o2.name);
    }
}
