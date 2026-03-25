package Stscks;

import java.util.Stack;

public class Lecture1 {
    public static void main(String[] args) {
        //LIFO
        Stack<String> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        
        st1.push(2);
        st1.push(4);
        st1.push(6);
        st1.push(8);
        System.out.println(st1);
        st.push("Apple");
        st.push("Banana");
        //st.pop();
        String s = st.pop();
        System.out.println(s);
        System.out.println(st);
        System.out.println(st.isEmpty());
        
        for(String s1:st){
            System.out.println(s1);
        }
        while(!st.isEmpty()){
            String s2 = st.pop();
            System.out.println(s2);
            
        }
    }
    
}
