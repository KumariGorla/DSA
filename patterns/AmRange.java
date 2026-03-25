class AmRange{
    public static void main(String[] args) {
        int low = 10, high = 10000;
        for(int num = low ; num <= high; num++){
            int len = getorder(num);
            if(num == getArmstrongnum(num,len))
                System.out.println(num);
        }

    }private static int getorder(int num){
        int len = 0;
        while(num != 0){
            len++;
            num = num / 10;

        }
        return len;
    }private static int getArmstrongnum(int num, int order){
        if(num == 0)
            return 0;

        int digit = num % 10;
        return (int) Math.pow(digit,order) + getArmstrongnum(num/10, order);
    }
}