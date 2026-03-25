package Stringsss;

import java.util.Stack;

public class revstrusingstack {
    public static void main(String[] args) {
        String s = "Kumari";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<=s.length()-1;i++){
            st.add(s.charAt(i));
        }
        System.out.println(st);
        while(!st.isEmpty()){
            Character ch = st.pop();
            sb.append(ch);
        }
        System.out.println(sb);
    }
    
}
