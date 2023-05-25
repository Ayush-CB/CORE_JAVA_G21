package Lec_23;

import java.util.HashMap;

public class HashMap_demo {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('A',65);
        map.put('B',66);
        map.put('C',67);
        map.put('D',68);
        map.put('E',69);
        System.out.println(map);
        map.put('A',8);
//        System.out.println(map);
//        System.out.println(map.get('P'));
//        System.out.println(map.containsKey('U'));
//        System.out.println(map.remove('D'));
//        System.out.println(map);
        display(map);
    }
    public static void display(HashMap<Character,Integer> map){
        for(Character c: map.keySet()){
            System.out.println("Key :"+c+" Value :"+map.get(c));
        }
    }
}
