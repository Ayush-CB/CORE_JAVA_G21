package Lec_15;

public class Anagram {
    public static void main(String[] args) {
        String s1="listei";
        String s2="silent";
        print(s1,s2);
    }
    public static void print(String s1,String s2){
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            int index=c-'a';
            freq1[index]++;
        }
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            int index=c-'a';
            freq2[index]++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
