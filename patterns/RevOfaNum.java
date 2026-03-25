public class RevOfaNum {
    public static int RevNum(int n ,int s){
        if (n == 0)
            return s;
        int rev = n % 10;
        s = s *10 + rev;
        
        return RevNum(n/10, s);
    }public static void main(String[] args) {
        int n = 123, s = 0;
        System.out.println(RevNum(n, s));
    }
    
}
