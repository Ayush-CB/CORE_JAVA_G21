package Lec_11;

public class Count_set_bits {
    public static void main(String[] args) {
        int n=31;
        count(31);
    }
    public static void count(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }

}
