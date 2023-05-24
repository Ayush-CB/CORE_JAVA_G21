package Lec_22;

public class Car implements Comparable<Car>{
    int speed;
    int price;
    String name;
    public Car(int sp,int pr,String nm){
        speed=sp;
        price=pr;
        name=nm;
    }

    @Override
    public String toString() {
        return this.name+"====>"+this.speed+"======>"+this.price;
    }

    @Override
    public int compareTo(Car o) {
        return this.speed-o.speed;
    }
}
