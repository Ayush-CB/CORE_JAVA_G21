package Lec_14;

public class Palin_substrings {
    public static void main(String[] args) {
        String s="NITIN";
        print(s);
    }
    public static void print(String s){
        for(int start=0;start<s.length();start++){
            for(int end=start+1;end<=s.length();end++){
                String sub=s.substring(start,end);
                if(palin2(sub)){
                    System.out.println(sub);
                }
            }
        }
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
