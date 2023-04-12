package Lec_4;

public class Pass_by_value {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int brr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        System.out.println(arr[0]+"  "+arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0]+"  "+arr[1]);
    }
   public static void swap(int a,int b){
        int tem=a;
        a=b;
        b=tem;
    }
}
