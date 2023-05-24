package Lec_22;

import java.util.Arrays;
import java.util.Comparator;

public class Car_client {
    public static void main(String[] args) {
        Car obj[]=new Car[5];
        obj[0]=new Car(100,2000,"A");
        obj[1]=new Car(90,200,"B");
        obj[2]=new Car(80,20,"C");
        obj[3]=new Car(70,2,"D");
        obj[4]=new Car(60,2000000,"E");
        for(int i=0;i<obj.length;i++){
            System.out.println(obj[i]);
        }
//        Sort(obj,new CarPrice());
        Arrays.sort(obj, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price-o2.price;
            }
        });
        for(int i=0;i<obj.length;i++){
            System.out.println(obj[i]);
        }
    }
    public static<T extends Comparable<Car>> void Sort(T arr[]){
        for(int count=1;count< arr.length;count++){
            for(int j=0;j< arr.length-count;j++){
                if(arr[j].compareTo((Car) arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static<T extends Comparable<Car>> void Sort(T arr[], Comparator<T> camp){
        for(int count=1;count< arr.length;count++){
            for(int j=0;j< arr.length-count;j++){
                if(camp.compare(arr[j],arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
