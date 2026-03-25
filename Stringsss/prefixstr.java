package Stringsss;

public class prefixstr {
    public static String PrintPrefix(String[] s){
        if(s==null || s.length==0) return "";
        String prefix = s[0];
        for(int i = 0;i<s.length;i++){
            while(s[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }


        }
        return prefix;

    }
    public static void main(String[] args) {
        String[] s = {"flower","flow","float","flying"};
        String res = PrintPrefix(s);
        System.out.println(res);

    }
}
