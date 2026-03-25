public class Factorialnum {
    public static int Fact_n(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fact_num = Fact_n(n - 1);
        int Fact_n1 = n * fact_num;
        return Fact_n1;
    }public static void main(String[] args) {
        int n = 5;
        int ans = Fact_n(n);
        System.out.println(ans);
    }
}
