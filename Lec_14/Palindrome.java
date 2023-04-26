package Lec_14;

public class Palindrome {
    public static void main(String[] args) {
        String s="NITIN";
//        System.out.println(palin(s));
        System.out.println(palin2(s));
    }
    public static boolean palin(String s){
        String rev=reverse(s);
        return s.equals(rev);
    }
    public static String reverse(String s){
        int start=s.length()-1;
        String ans="";
        while(start>=0){
            ans=ans+s.charAt(start);
            start--;
        }
        return ans;
    }
    public static boolean palin2(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
