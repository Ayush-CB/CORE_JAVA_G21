package Lec_18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inbuilt {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        System.out.println(st.peek());
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
    }
}
