package Lec_19;

import java.util.Stack;

public class Stock_span {
    public static void main(String[] args) {
        int arr[]={100,60,70,55,65,80,90};
        print(arr);
    }
    public static void print(int arr[]){
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int ans[]=new int[arr.length];
        ans[0]=1;
        for(int i=1;i< arr.length;i++){
            while(!st.empty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
