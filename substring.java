import java.util.*;
public class substring {
    public static void main(String[] args) {
        String s = "ABAB";
        ArrayList<String> substring = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                String sub = s.substring(i,j + 1);
                if(sub.length()==3)
                    substring.add(sub);
                
            }
        }
        System.out.println(substring);
    }
}
