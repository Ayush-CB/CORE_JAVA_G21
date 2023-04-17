package Lec_7;

public class Rain_water_trapping {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        trapping(arr);
    }
    public static void trapping(int arr[]){
        int n=arr.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int min=Math.min(leftmax[i],rightmax[i]);
            ans=ans+(min-arr[i]);
        }
        System.out.println(ans);
    }
}
