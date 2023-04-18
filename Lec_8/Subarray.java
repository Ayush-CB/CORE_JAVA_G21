package Lec_8;

public class Subarray {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
//    print(arr);
//        print2(arr);
        print3(arr);
    }
    public static void print(int arr[]){
        int max=0;
        for(int start=0;start< arr.length;start++){
            for(int end=start;end< arr.length;end++){
                for(int st=start;st<=end;st++){
                    System.out.print(arr[st]+" ");
                }

                System.out.println();
            }
        }
    }
    public static void print2(int arr[]){
        int max=0;
        for(int start=0;start< arr.length;start++){
            for(int end=start;end< arr.length;end++){
                int sum=0;
                for(int st=start;st<=end;st++){
                    System.out.print(arr[st]+" ");
                    sum=sum+arr[st];
                }
                max=Math.max(max,sum);
                System.out.print("======="+sum);
                System.out.println();
            }
        }
        System.out.println(max);
    }
    public static void print3(int arr[]){
        int max=0;
        for(int start=0;start<arr.length;start++){
            int sum=0;
            for(int end=start;end<arr.length;end++){
                sum=sum+arr[end];

            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
