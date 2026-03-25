//public class RevNum {
//    public static void main(String[] args) {
//        String s = "Lalyani";
//        String ans = "";
//        for(int i = s.length()-1;i>=0;i--){
//            ans = ans + s.charAt(i);
//        }
//        if(ans.equals(s)){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not A Palindrome");
//        }
//    }
//}


//Using recursion


public class RevNum{
    public static void REVERSEstr(String s,int idx){
        if(idx == 0){
            System.out.println(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        REVERSEstr(s, idx-1);
    }public static void main(String[] args) {
        String s = "abcd";
        REVERSEstr(s,s.length()-1);
    }
}

