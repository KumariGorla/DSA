public class PrintNum {
    public static void PrintNum1(int n){
        if (n ==0){
            return;
        }
        System.out.println(n);
        PrintNum1(n-1);
    }public static void main(String[] args) {
        int n = 5;//If n = 0 then return nothing
        PrintNum1(n);
    }
    
}
