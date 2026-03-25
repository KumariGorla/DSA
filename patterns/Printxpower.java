public class Printxpower {
    public static int Xpower(int x , int n){
        if(n == 0){
            return 1;
        }if(x == 0){
            return 0;
        }
        //If stack size is not log(n)


        //int Xpower1 = Xpower(x,n - 1);
        //int xnum = x * Xpower1;
        //return xnum;

        //If stack size is log(n) Then use following trick

        //If n is even
        if(n % 2 == 0){
            return Xpower(x, n/2) * Xpower(x, n/2);
        }else{
            return Xpower(x, n/2) * Xpower(x, n/2) * 2;//If n is odd
        }
    }public static void main(String[] args) {
        int x = 2,n = 4;
        int ans = Xpower(x,n);
        System.out.println(ans);
    }
}
