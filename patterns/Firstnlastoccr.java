public class Firstnlastoccr {
    public static int first = -1;
    public static int last = -1;
    public static void FindOccurance(String s,int idx,char ele){
        if(idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char ch = s.charAt(idx);
        if(ch == ele){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        FindOccurance(s, idx+1, ele);
    }public static void main(String[] args) {
        String s= "absdejfjsjdiaadeia";
        FindOccurance(s,0, 'a');
    }
}

