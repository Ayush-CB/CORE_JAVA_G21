package Lec_22;
import java.util.*;
public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        System.out.println(ar.size());
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        System.out.println(ar);
        ar.remove(0);
        System.out.println(ar);
        ar.add(0,10);
        System.out.println(ar);
    }
}
