package Lec_22;

import java.util.ArrayList;

public class Function_demo {
    public static void main(String[] args) {
        Integer arr[]={10,20,30,40,50};
        display(arr);
        String arr1[]={"A","B","C","D","E"};
        display(arr1);
        ArrayList ar=new ArrayList();
        ar.add(1);
        ar.add("Hello");
        ar.add(3.0);
        System.out.println(ar);
    }
    public static<T> void display(T arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
