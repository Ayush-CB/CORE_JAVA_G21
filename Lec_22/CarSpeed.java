package Lec_22;

import java.util.Comparator;

public class CarSpeed implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.speed-o2.speed;
    }
}
