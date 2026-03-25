public class Someofdigits {
    public static int SumOfDigi(int n,int sum){
    
        if(n == 0)
            return sum;
        
        sum += n % 10;
        n = n / 10;//To dec this line we have to keep n /10 in the below function call
        return SumOfDigi(n,sum);
    }public static void main(String[] args) {
        int n = 12345,sum = 0;
        System.out.println(SumOfDigi(n,sum));
    }
    
}

/* 
public static int GetSum(int num){
if (n == 0)
    return 0;
return (n %10) + GetSum(n / 100);
}
 */
