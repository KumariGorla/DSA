public class subseq {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        int total = 1 << n;
        for(int i = 0;i<total;i++){
            StringBuilder subseq= new StringBuilder();
            for(int j = 0;j<n;j++){
                if((i&(1<<(n-j-1)))!=0){
                    subseq.append(s.charAt(j));
                }
            }
            System.out.println(subseq.toString());
        }
    }
}
