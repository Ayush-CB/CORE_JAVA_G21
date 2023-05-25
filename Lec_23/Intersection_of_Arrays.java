package Lec_23;

import java.util.HashMap;

public class Intersection_of_Arrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6,6,7};
        int arr1[]={1,1,3,5,6,6,6,7,7};
        intersection(arr,arr1);
    }
    public static void intersection(int arr[],int arr1[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i:arr1){
            if(map.containsKey(i)){
                System.out.println(i);
                map.put(i,map.get(i)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }

    }
}
