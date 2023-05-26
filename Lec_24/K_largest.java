package Lec_24;

import java.util.Collections;
import java.util.PriorityQueue;

public class K_largest {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,5,6,7,11,10};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(arr[i]);
        }
        for(int i=3;i< arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }

    }
}
