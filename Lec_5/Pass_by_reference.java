package Lec_5;

public class Pass_by_reference {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arr[0]+"  "+arr[1]);
        swap(arr);
        System.out.println(arr[0]+"  "+arr[1]);
    }
    public static void swap(int arr[]){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
}
