package Lec_10;

public class Magic_number {
    public static void main(String[] args) {
        int n=5;
        magic(n);
    }
    public static void magic(int n){
        int mul=5;
        int ans=0;
        while(n!=0){
            ans=ans+mul*(n&1);
            mul=mul*5;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
