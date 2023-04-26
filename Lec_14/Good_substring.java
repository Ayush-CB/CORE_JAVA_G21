package Lec_14;

public class Good_substring {
    public static void main(String[] args) {
        String s="aeiou";
        good(s);
    }
    public static void good(String s){
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        System.out.println(max);
    }
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}
