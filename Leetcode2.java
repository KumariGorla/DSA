import java.util.HashSet;

public class Leetcode2 {
    public static boolean fun(String s,int k){
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            hs.add(ch);
        }
        if(hs.size()==k){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "kumari";
       
        int ans = 0;
        int k = 3;
        for(int i = 0;i<k+1;i++){
            boolean temp  = fun(s.substring(i, i+k), k);
            if(temp){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
