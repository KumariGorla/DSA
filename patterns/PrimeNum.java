public class PrimeNum {
    public static void main(String[] args) {
        int n = 10;
        CheckPrime(n);
    }public static void CheckPrime(int n){
        int count = 0;
        if(n < 2){
            System.out.println("Not a prime");
            System.exit(0);
        }for(int i = 2;i<=n;i++){
            if(n % i == 0)
                count += 1;
        }
        if(count>2)
            System.out.println("Not a prime");
        else
            System.out.println("Prime");
    }
}
