package Lec_14;

public class Reverse_String {
    public static void main(String[] args) {
        String s="ABCDE";
//        reverse(s);
        reverse2(s);
    }
    public static void reverse(String s){
        int start=s.length()-1;
        while(start>=0){
            System.out.print(s.charAt(start));
            start--;
        }
    }
    public static void reverse2(String s){
        int start=s.length()-1;
        String ans="";
        while(start>=0){
            ans=ans+s.charAt(start);
            start--;
        }
        System.out.println(ans);
    }
}
