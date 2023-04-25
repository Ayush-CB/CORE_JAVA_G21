package Lec_13;

public class Print_Substring {
    public static void main(String[] args) {
        String s="abcde";
        print(s);
    }
    public static void print(String s){
        for(int st=0;st<s.length();st++){
            for(int end=st+1;end<=s.length();end++){
                System.out.println(s.substring(st,end));
            }
        }
    }
}
