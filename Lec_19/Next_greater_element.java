package Lec_19;

import java.util.Stack;

public class Next_greater_element {
    public static void main(String[] args) {
        int arr[]={3,2,5,1,7,8,2,10};
        greater(arr);
    }
    public static void greater(int arr[]){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                if(arr[st.peek()]>arr[i]){
                    st.push(i);
                }
                else{
                    while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                        ans[st.peek()]=arr[i];
                        st.pop();
                    }
                    st.push(i);
                }
            }
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
