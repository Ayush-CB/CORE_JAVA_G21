package Lec_5;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4};
        bubble(arr);
    }
    public static void bubble(int arr[]){
        for(int j=0;j< arr.length;j++) {
            for (int i = 0; i < arr.length - 1-j; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
